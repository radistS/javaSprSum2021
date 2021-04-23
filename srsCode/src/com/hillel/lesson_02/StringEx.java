package com.hillel.lesson_02;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "Hello world";
        System.out.println(str1.length());
        str1 = "Hello world      ";
        System.out.println(str1.length());
        str1 = str1.trim();
        System.out.println(str1.length());


        char[] c = str1.toCharArray();

        for (char ch : c) {
            System.out.print(ch + "-");
        }
        System.out.println();
        String str2 = "";
//        System.out.println(str2.length());
//        System.out.println(str2.isBlank());
//        System.out.println(str2.isEmpty());


        str1 = "one";
        str2 = "two";

        str1 = str1.concat(str2).concat(str2);

        System.out.println(str1);

        str1 = String.valueOf(100);
        System.out.println(str1);

        str1 = String.join("<->",str1, str2, str1, str2, "_");
        System.out.println(str1);


        str1 = "onen";
        str2 = "Onen";
        String str3 = "two";

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));


        System.out.println(str1.indexOf('d'));
        System.out.println(str1.indexOf('n'));
        System.out.println(str1.lastIndexOf('d'));
        System.out.println(str1.lastIndexOf('n'));



        String fileName = "pic.jpg";

        System.out.println(fileName.endsWith(".jpg"));

        str1 = "  _   _  ";
        System.out.println(str1.length());
        System.out.println(str1.trim().length());
        System.out.print(str1);
        System.out.println("|");
        System.out.print(str1.trim());System.out.println("|");

        System.out.println("HellO WoRlD".toLowerCase());
        System.out.println("HellO WoRlD".toUpperCase());
    }
}
