package com.hillel.lesson_12.exception;

public class TF {
    public static void main(String[] args) {
        System.out.println(validate());
    }

    private static Boolean validate() {
        try {
            System.out.println("1");
//            throw new RuntimeException();
            System.exit(1);
//            return true;
        }
        catch (RuntimeException re){
            System.out.println(re.getMessage());
        }
        finally {
            System.out.println("2");
        }
        return false;
    }
}


