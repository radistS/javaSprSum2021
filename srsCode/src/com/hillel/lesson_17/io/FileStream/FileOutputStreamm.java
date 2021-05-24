package com.hillel.lesson_17.io.FileStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamm {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream =
                new FileOutputStream("/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/io/FileStream/output.txt", false);

        outputStream.write("dasdasd".getBytes(StandardCharsets.UTF_8));
    }
}
