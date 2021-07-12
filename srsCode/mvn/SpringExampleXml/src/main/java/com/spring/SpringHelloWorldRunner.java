package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("srsCode/mvn/SpringExampleXml/src/resources/spring-bean.xml");

        Teacher t = (Teacher)context.getBean("teacher");
        Student s = (Student) context.getBean("student");

        System.out.println(t.toString());
        System.out.println(s.toString());



        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        SpringHelloWorld springHelloWorld1 = (SpringHelloWorld) context.getBean("springHelloWorld");
        SpringHelloWorld springHelloWorld2 = (SpringHelloWorld) context.getBean("springHelloWorld");
//        SpringHelloWorld springHelloWorld1 = (SpringHelloWorld) context.getBean("helloWorld");

//        System.out.println(springHelloWorld.getStudent().toString());
//        System.out.println(springHelloWorld1);

//        System.out.println(springHelloWorld.getUser().toString());
//        System.out.println(springHelloWorld1.getUser().toString());

//        Object obj = context.getBean("say");
//
//        ((Say) obj).say();
//
//        springHelloWorld.getHelloMessage();
    }
}
