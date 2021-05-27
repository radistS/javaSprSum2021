package com.pars.json;

import com.google.gson.Gson;
import com.pars.ReadFromFile;
import com.pars.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JsonExampleToList {

    public static void main(String[] args) {
        String json = ReadFromFile.readToString("/Users/stepurkoolksandr/javaSprSum2021/srsCode/mvn/pars/src/main/resources/phoneBook.json");
//        String json = ReadFromFile.readToString("/Users/stepurkoolksandr/javaSprSum2021/srsCode/mvn/pars/src/main/resources/phoneBook_1.json");

        Gson gson = new Gson();
        User[] user = gson.fromJson(json, User[].class);

        List<User> users = Arrays.stream(user).sorted(Comparator.comparing(User::getAge).
                thenComparing(User::getLastName).reversed()).collect(Collectors.toList());

        for (User u : user) {
            System.out.println(u);
        }

        System.out.println("---------");

        users.forEach(System.out::println);

    }
}
