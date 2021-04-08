package com.hillel.lesson_07.enumer;


public class Main {
    public static void main(String[] args) {

////         Basic enum
//        System.out.println("Enum >>> " + UserStatus.class.getSimpleName());
//        System.out.println(UserStatus.ACTIVE);
//        System.out.println(UserStatus.DELETED);
//        System.out.println();
//
//        User usr = new User("test@email.com");
//
//        System.out.println(usr);
//        usr.setStatus(UserStatus.ACTIVE);
//        System.out.println(usr);


//        // enum + field
//        System.out.println("Enum >>> " + SearchSystem.class.getSimpleName());
//        System.out.println(SearchSystem.GOOGLE);
//        System.out.println(SearchSystem.GOOGLE.url());
//        System.out.println(SearchSystem.GOOGLE.rating());
//        SearchSystem.GOOGLE.setRating(12);
//        System.out.println(SearchSystem.GOOGLE.rating());
//        System.out.println();

//        //enum + method + some logic
//        System.out.println("Enum >>> " + Operation.class.getSimpleName());
//        System.out.println(Operation.MINUS.calculate(10, 5));
//        System.out.println(Operation.PLUS.calculate(10, 5));


        UserStatus[] values = UserStatus.values();

        for (UserStatus us : values) {
            System.out.println(us);
        }

        System.out.println(SearchSystem.valueOf("GOOGLE").toString());

    }
}
