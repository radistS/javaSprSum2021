package com.pars.xml.dom;


import com.pars.User;
import com.pars.xml.sax.UserSaxExample;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UserDomExample {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(UserSaxExample.class.getClassLoader().getResource("phoneBook_1.xml").getFile()));

        document.getDocumentElement().normalize();

        NodeList nList = document.getElementsByTagName("user");

        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                users.add(new User(eElement.getElementsByTagName("firstName").item(0).getTextContent(),
                        eElement.getElementsByTagName("lastName").item(0).getTextContent(),
                        Integer.valueOf(eElement.getElementsByTagName("age").item(0).getTextContent()),
                        eElement.getElementsByTagName("email").item(0).getTextContent(),
                        eElement.getElementsByTagName("technology").item(0).getTextContent()
                ));
            }
        }
        for (User user : users)
            System.out.println(user.toString());
    }
}
