package com.hillel.lesson_23.reflection;

import java.lang.reflect.Field;
import java.util.List;

public class ClassGetFields {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.hillel.lesson_23.reflection.Feeee");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            Class<?> fld = field.getType();
            System.out.println("Field name : " + field.getName());
            System.out.println("Field type : " + fld.getName());

        }
    }
}

class Fee{
    public Integer id;
    public String name;
    public Boolean isActive;
    public List<String> permission;
    private String email;
    private Long phone;
}

class Feee extends Fee{
    public String feeName;
}

class Feeee extends Feee{
    public String feeeName;
}