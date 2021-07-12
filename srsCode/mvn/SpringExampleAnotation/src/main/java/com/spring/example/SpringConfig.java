package com.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {
    @Bean(name = "helloWorld")
    public SpringHelloWorld getHelloWorld() {
        return new SpringHelloWorld();
    }

    @Bean(name = "userIvanov")
    @Primary
    public User getUser() {
        return new User("Ivan", "Ivanov", "ivan@ivanov.com");
    }

    @Bean(name = "userSidorov")
//    @Primary
    public User user() {
        return new User("Sidr", "Sidorov", "sidr@sidorov.com");
    }

    @Bean(name = "print")
    @Scope(value = "prototype")
    public Print pr() {
        return new Print();
    }

}
