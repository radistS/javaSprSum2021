package com.hillel.lesson_09.coll;

public class Entry {
    String value;
    Entry left;
    Entry right;

    public Entry(String value) {
        this.value = value;
    }

    public Entry(String value, Entry left, Entry right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setLeft(Entry left) {
        this.left = left;
    }

    public void setRight(Entry right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public Entry getLeft() {
        return left;
    }

    public Entry getRight() {
        return right;
    }
}
