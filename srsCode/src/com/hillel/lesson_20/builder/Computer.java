package com.hillel.lesson_20.builder;

public class Computer {

    private String RAM;
    private String HDD;
    private String CPU;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public Computer() {
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class Builder {
        private String RAM;
        private String HDD;
        private String CPU;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder() {
        }

        public Builder setRamSize(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setHddSize(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder setCpuSpeed(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}