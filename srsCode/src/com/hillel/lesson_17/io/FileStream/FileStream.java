package com.hillel.lesson_17.io.FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/FileStream/input.txt");
        int size = inputStream.available();
        System.out.println(size);
        for (int i = 0; i < size; i++){
            System.out.print((char) inputStream.read());
        }
        inputStream.close();

        // Output stream
        OutputStream outputStream = new FileOutputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/FileStream/input.txt");


        String str = "aaa sss d dd ff f ";

        outputStream.write(str.getBytes(StandardCharsets.UTF_8));


    }
}
