package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSayRunner {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("srsCode/mvn/SpringExampleXml/src/resources/spring-bean.xml");
        Say obj1 = (Say) context.getBean("say");
        obj1.say();

        System.exit(2);
    }
}
