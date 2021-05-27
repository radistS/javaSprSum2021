package com.pars.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import com.pars.User;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSaxExample_1 extends DefaultHandler {

    private static List<User> userList = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File(UserSaxExample_1.class.getClassLoader().getResource("phoneBook_1.xml").getFile()), handler);

        for (User user : userList)
            System.out.println(user.toString());
    }

    private static class XMLHandler extends DefaultHandler {
        private String firstName;
        private String lastName;
        private String age;
        private String email;
        private String technology;

        private String lastElementName;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("firstName"))
                    firstName = information;
                if (lastElementName.equals("lastName"))
                    lastName = information;
                if (lastElementName.equals("age"))
                    age = information;
                if (lastElementName.equals("email"))
                    email = information;
                if (lastElementName.equals("technology"))
                    technology = information;
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((firstName != null && !firstName.isEmpty())
                    && (lastName != null && !lastName.isEmpty())
                    && (age != null && !age.isEmpty())
                    && (email != null && !email.isEmpty())
                    && (technology != null && !technology.isEmpty())
            ) {
                userList.add(new User(firstName, lastName, Integer.valueOf(age), email, technology));
                firstName = null;
                lastName = null;
                age = null;
                email = null;
                technology = null;
            }
        }
    }
}

