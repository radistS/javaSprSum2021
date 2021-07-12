package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SpringHelloWorld helloWorldBean = context.getBean("helloWorld", SpringHelloWorld.class);
        helloWorldBean.setHelloMessage("Hello hello");
        helloWorldBean.getHelloMessage();
        System.out.println(helloWorldBean.getUser().toString());
        System.out.println("------");
        helloWorldBean.printUser();

//        helloWorldBean.printMessage("MS_1");
//        helloWorldBean.printMessage("MS_2");
//        helloWorldBean.printMessage("MS_3");
//        helloWorldBean.printMessage("MS_4");
    }
}
