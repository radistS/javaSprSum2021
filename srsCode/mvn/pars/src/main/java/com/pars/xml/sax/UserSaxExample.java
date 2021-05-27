package com.pars.xml.sax;

import com.pars.Admin;
import com.pars.User;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserSaxExample extends DefaultHandler {

    private static List<User> userList = new ArrayList<>();
    private static List<Admin> adminList = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File(UserSaxExample.class.getClassLoader().getResource("phoneBook.xml").getFile()), handler);
        for (User user : userList)
            System.out.println(user.toString());

        System.out.println();

        for (Admin admin : adminList)
            System.out.println(admin.toString());
    }

    private static class XMLHandler extends DefaultHandler {
        /*
            private String firstName;
            private String lastName;
            private int age;
            private String email;
            private String technology;
         */
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("user")) {
                String firstName = attributes.getValue("firstName");
                String lastName = attributes.getValue("lastName");
                String age = attributes.getValue("age");
                String email = attributes.getValue("email");
                String technology = attributes.getValue("technology");
                userList.add(new User(firstName, lastName, Integer.valueOf(age), email, technology));
            } else if (qName.equals("admin")) {
                String firstName = attributes.getValue("firstName");
                String lastName = attributes.getValue("lastName");
                String email = attributes.getValue("email");
                String permission = attributes.getValue("permission");
                adminList.add(new Admin(firstName, lastName, email, permission));
            } else if(qName.equals("users")){
                System.out.println("---> users");
            }
        }

        @Override
        public void startDocument() throws SAXException {
            // Тут будет логика реакции на начало документа
        }

        @Override
        public void endDocument() throws SAXException {
            // Тут будет логика реакции на конец документа
        }


        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            // Тут будет логика реакции на конец элемента
        }
    }
}

