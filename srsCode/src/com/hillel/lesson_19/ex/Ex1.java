package com.hillel.lesson_19.ex;

public class Ex1 {
    public static void main(String[] args) {
        boolean flag1 = "Java" == "Java"
                .replace( 'J' , 'J' );
        boolean flag2 = "Java" == "Java"
                .replace( 'J' , 'j' ).replace('j', 'J');
        System.out.println(flag1);
        System.out.println(flag2);
        System. out .println(flag1 && flag2);
    }
}


