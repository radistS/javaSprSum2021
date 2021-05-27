package com.pars.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.pars.User;

import java.io.IOException;

public class JsonExampleToClass {

    public static void main(String[] args) throws IOException {
        String json = "{" +
                "        'firstName': 'Alex'," +
                "        'lastName': 'Stepurko'," +
                "        'age': '5'," +
                "        'workAge': '5'," +
                "        'email': 'stepurko@info.com'," +
                "        'technology': 'Java'" +
                "      }";
        // Gson lib example
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        System.out.println(user.toString());
        user.setTechnology("PHP");


        System.out.println(gson.toJson(user));


        // jackson lib example

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        User us = objectMapper.readValue(json, User.class);
        System.out.println(us.toString());

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(us));
    }
}
