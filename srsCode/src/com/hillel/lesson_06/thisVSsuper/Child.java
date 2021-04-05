package com.hillel.lesson_06.thisVSsuper;

public class Child extends Parent {
    private String mName; // mother
    private String faName; // father
    private int age;

    public Child(String fName, String lName, String mName, String faName) {
        super(fName, lName);
        this.mName = mName;
        this.faName = faName;
        System.out.println("child : (fName, lName, mName, faName)");
    }

    public Child(String fName, String lName) {
       this();
       this.setfName(fName);
       this.setlName(lName);
    }

    public Child() {
        System.out.println("child : ()");
    }

    public Child(String mName) {
        this.mName = mName;
        System.out.println("child : (mName)");
    }

    public Child(int age) {
        super();
        this.age = age;
        System.out.println("child : (age)");
    }

    @Override
    public String toString() {
        return "Child{" +
                "parent fName='" + super.getfName() + '\'' +
                ", parent lName='" + super.getlName() + '\'' +
                ", mName='" + mName + '\'' +
                ", faName='" + faName + '\'' +
                ", age=" + age +
                '}';
    }
}
