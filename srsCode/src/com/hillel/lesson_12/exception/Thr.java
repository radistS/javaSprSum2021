package com.hillel.lesson_12.exception;

import java.sql.SQLException;

public class Thr {
    public static void main(String[] args) {
        System.out.println("1111");
        try {
            Ex1.ex();
        } catch (BussinesException | IndexOutOfBoundsException | SQLException  e ) {
            e.printStackTrace();
        }
        System.out.println("2222");
    }
}

class Ex1 {
public static void ex() throws SQLException {
    throw new SQLException("sss");
}
}
