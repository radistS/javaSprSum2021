package com.hillel.lesson_23.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

public class ClassGetDFields {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.hillel.lesson_23.reflection.DFee");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fld = field.getType();
            System.out.println("Field name : " + field.getName());
            System.out.println("Field type : " + fld.getName());
            System.out.println("Public : " + Modifier.isPublic(field.getModifiers()));
            System.out.println("-----------");
        }
    }
}

class DFee{
    public Integer id;
    public String name;
    public Boolean isActive;
    public List<String> permission;
    String email;
    private Long phone;
}
