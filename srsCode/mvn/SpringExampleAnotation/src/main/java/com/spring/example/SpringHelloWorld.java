package com.spring.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Setter
@Getter
public class SpringHelloWorld {
    private String helloMessage;
    @Autowired
//    @Qualifier("userIvanov")
    @Qualifier("userSidorov")
    private User user;

    @Autowired
    private Print print;

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void getHelloMessage() {
        System.out.println("Hello message: " + helloMessage);
    }

    void printMessage(String str){
//        System.out.println(print.toString());
        print.print(str);
    }

    void printUser(){
        print.print(user.toString());
    }
}
