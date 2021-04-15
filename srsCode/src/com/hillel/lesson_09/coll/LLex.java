package com.hillel.lesson_09.coll;

public class LLex {
    public static void main(String[] args) {
        // Step 1
        Entry entry1 = new Entry("value1");

        entry1.setLeft(entry1);
        entry1.setRight(entry1);


        // Step 2
        Entry entry2 = new Entry("value2");
        entry1.setLeft(entry2);
        entry1.setRight(entry2);
        entry2.setRight(entry1);
        entry2.setLeft(entry1);

        System.out.println(entry1.getValue());
        System.out.println(entry1.getRight().getValue());


        // Step 3
        Entry entry3 = new Entry("value3");
        entry3.setRight(entry1);
        entry3.setLeft(entry2);
        entry2.setRight(entry3);
        entry1.setLeft(entry3);
        System.out.println(entry1.getRight().getRight().getValue());
        System.out.println(entry1.getLeft().getValue());


        System.out.println(entry3.getLeft().getLeft().getLeft().getLeft().getLeft().getLeft().getValue());
    }
}
