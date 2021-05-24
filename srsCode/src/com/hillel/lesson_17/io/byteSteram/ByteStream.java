package com.hillel.lesson_17.io.byteSteram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
        try(
//                FileInputStream fis = new FileInputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/output.txt"); // -> from
//                FileOutputStream fos = new FileOutputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/input.txt");

                FileInputStream fis = new FileInputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/plain.jpg"); // -> from
                FileOutputStream fos = new FileOutputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/out_plain.jpg");
                )

        {
//             fis = new FileInputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/output.txt"); // -> from
//             fos = new FileOutputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/byteSteram/input.txt"); // -> to
//            fis = new FileInputStream("/Users/stepurkoolksandr/javaWinter2020/lessons/src/com/hillel/lesson_17/io/byteSteram/plain.jpg"); // -> from
//             fos = new FileOutputStream("/Users/stepurkoolksandr/javaWinter2020/lessons/src/com/hillel/lesson_17/io/byteSteram/out_pic.jpg"); // -> to
            int a;
            while ((a = fis.read()) != -1) {
                fos.write(a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
