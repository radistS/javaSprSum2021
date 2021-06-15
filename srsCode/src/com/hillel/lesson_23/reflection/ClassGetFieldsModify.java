package com.hillel.lesson_23.reflection;

import java.lang.reflect.Field;

public class ClassGetFieldsModify {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassNotFoundException {
        Name name = new Name("old value");
        System.out.println(name);
        System.out.println("--------");
        Class<?> nameClass = name.getClass();

        Field field = nameClass.getField("name");
        System.out.println(field.get(name));
        field.set(name, "new value");
        System.out.println(field.get(name));

        System.out.println("------------");
        System.out.println(name);

        Class nameC = Class.forName("com.hillel.lesson_23.reflection.Name");
        Field fieldC = nameC.getField("staticName");
        fieldC.set(name, "staticName");
        System.out.println(Name.staticName);

        Name nameMod = new Name("Name Mod");

        System.out.println(nameMod);
        System.out.println(name);
    }
}

class Name {
    public static String staticName;
    public String name;

    public Name(String name) {
        this.name = name;
    }

    public static String getStaticName() {
        return staticName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                "staticName='" + staticName + '\'' +
                '}';
    }
}