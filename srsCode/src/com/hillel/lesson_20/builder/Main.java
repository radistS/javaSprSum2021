package com.hillel.lesson_20.builder;

public class Main {
    public static void main(String[] args) {
        // lesson 17
        Computer computer = new Computer();
        computer.setBluetoothEnabled(false);
        computer.setGraphicsCardEnabled(false);
        computer.setCPU("i9");
        computer.setHDD("500Gb");
        computer.setRAM("16Gb");

        System.out.println(computer);

        Computer computerBulder = new Computer.Builder()
                .setCpuSpeed("i7")
                .setHddSize("1024Gb")
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computerBulder);
    }
}
