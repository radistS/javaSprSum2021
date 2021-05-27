package com.pars.xml.dom;

import com.pars.User;
import com.pars.xml.sax.UserSaxExample;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserDomExample_1 {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(UserSaxExample.class.getClassLoader().getResource("phoneBook.xml").getFile()));

        NodeList userElement = document.getDocumentElement().getElementsByTagName("user");

        for (int i = 0; i < userElement.getLength(); i++) {
            Node employee = userElement.item(i);

            NamedNodeMap attributes = employee.getAttributes();

            users.add(new User(attributes.getNamedItem("firstName").getNodeValue()
                    , attributes.getNamedItem("lastName").getNodeValue()
                    , Integer.valueOf(attributes.getNamedItem("age").getNodeValue())
                    , attributes.getNamedItem("email").getNodeValue()
                    , attributes.getNamedItem("technology").getNodeValue()
            ));
        }

        for (User user : users)
            System.out.println(user.toString());
    }
}
