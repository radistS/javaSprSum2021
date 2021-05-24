package com.hillel.lesson_17.folders;

import java.io.File;

public class FolderSeparator {
    public static void main(String[] args) {
        String folder = "baseFolder";

        folder = folder.concat(File.separator).concat("1").concat(File.separator).concat("1").concat(File.separator).concat("1");

        System.out.println(folder);
    }
}
