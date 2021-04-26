package com.hillel.lesson_12.exception;

public class ThrowsException {
    public static void main(String[] args) throws Exception {
//        try {
            new People().print();
//
//        } catch (BussinesException ex) {
//            System.out.println(ex.getMessage());
//        }
        System.out.println("ssss"
        );
    }
}

class People {
    void print() throws Exception {
        throw new BussinesException("Business exception ");
    }
}

