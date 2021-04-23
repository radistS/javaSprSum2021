package com.hillel;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class Run {
    public static void main(String[] args) {
        System.out.println("My first maven application ...");

        User user = new User("Alex", "alex@email.com", "+380569454654", 27);


        User user1 = User.builder().name("s").age(19).email("email").build();


        User user2 = new User()
                            .setName("123")
                            .setEmail("23123")
                            .setPhone("asd");

        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);


        StringUtils.reverse("TEXT");

        for (int i =0; i < 10; i++){
            System.out.println(RandomStringUtils.random(4, false, true));
        }
    }
}
