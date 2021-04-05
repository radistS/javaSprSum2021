package com.hillel.lesson_06.interfaces;

public class Main {
    public static void main(String[] args) {
        Say say;

        if (args.length != 0 && args[0].equals("rus")) {
            say = new Rus();
        } else {
            say = new Engl();
        }

        say.sayHello(); // SayHello
        say.sayGoodBuy(); // Say

        Say.hello();
    }
}
