package com.hillel.lesson_17;

import java.io.File;
import java.util.Objects;

public class FolderStructure {

    private static final String FILE = "[F] : ";
    private static final String DIR = "[D] : ";
    private static final String PREF = "--";

    public static void main(String[] args) {

        String rootDir = "/Users/stepurkoolksandr/javaSprSum2021";

        File f = new File(rootDir);

        for (File s : Objects.requireNonNull(f.listFiles())){
            getFileStructure(s, "");
        }
    }

    private static void getFileStructure(File file, String prefix){
        if (file.isFile()) {
            System.out.println(prefix + FILE.concat(file.getName()));
        } else {
            System.out.println(prefix + DIR.concat(file.getName()));
            for (File f : Objects.requireNonNull(file.listFiles())){
                getFileStructure(f, prefix + PREF);
            }
        }
    }
}
