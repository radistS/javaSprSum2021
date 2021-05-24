package com.hillel.lesson_17.io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File path = new File("/Users/stepurkoolksandr/IdeaProjects/HillelJE2020/lessons/src/lesson_16");
//        File path = new File("/Users/stepurkoolksandr/IdeaProjects/HillelJE2020/lessons/src/lesson_16/OssDetector.java");
        File [] list = path.listFiles();

        for (File file : list){
            System.out.println(file.getName() + " -> isFile : " + file.isFile());
        }
    }
}
