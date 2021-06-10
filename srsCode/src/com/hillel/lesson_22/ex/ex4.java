package com.hillel.lesson_22.ex;

public class ex4 {
    public static void main(String[] args) {
        byte var = 100 ; // -128 .. 127
        switch (var) {
            case 100 :
                System. out .println( "var is 100" );
                break ;
//            case 200 :
//                System. out .println( "var is 127" );
//                break ;
            default :
                System. out .println( "In default" );
        }
    }
}
