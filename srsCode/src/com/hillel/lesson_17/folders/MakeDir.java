package com.hillel.lesson_17.folders;

import java.io.File;
import java.io.IOException;

public class MakeDir {
    public static void main(String[] args) throws IOException {
        String baseName = "/Users/stepurkoolksandr/javaSprSum2021/srsCode/src/com/hillel/lesson_17/folders";
        String dirName = baseName + "/newDir";
        String createFile = dirName + "/test.txt";
        String dirName1 = baseName + "/newDir/1/2/3/folder";
        File dir = new File(dirName);
        File dir1 = new File(dirName1);

        File file = new File(createFile);

        if (!file.exists())
            System.out.println(file.createNewFile());

//        if (file.exists())
//            System.out.println(file.delete());

//        System.out.println(dir.mkdir());   // one level
//        System.out.println(dir1.mkdirs()); // multi level


//        System.out.println(dir1.exists());
//        System.out.println(dir1.isDirectory());
//        System.out.println(dir1.isHidden());
//        System.out.println(dir1.isFile());
//        System.out.println(dir1.canRead());
//        System.out.println(dir1.canWrite());
//        System.out.println(dir1.canExecute());
//
//
//        System.out.println(dir1.getName());
//        System.out.println(dir1.getParent());
//        System.out.println(dir1.listFiles().length);
//        System.out.println(dir1.getParentFile());


    }
}
