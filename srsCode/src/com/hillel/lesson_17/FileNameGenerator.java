package com.hillel.lesson_17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class FileNameGenerator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name ...");
        String name = sc.nextLine();
        System.out.println(name);

        String fileName = "log_" + name.toLowerCase(Locale.ROOT) + "_" +
        new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + ".log";

        System.out.println(fileName);

        // get file location on hdd
        Path currentRelativePath = Paths.get("srsCode/src/com/hillel/lesson_17");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        File file = new File(s.concat(File.separator).concat(fileName));

        if(!file.exists()){
            file.createNewFile();
        } else {
            String newName = file.getName().split("\\.")[0] + "_1." + file.getName().split("\\.")[1];
            System.out.println(newName);
            new File(newName).createNewFile();
        }



    }
}
