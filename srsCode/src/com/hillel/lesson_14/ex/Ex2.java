package com.hillel.lesson_14.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> trafficLight = new ArrayList<>();
        trafficLight.add("RED");
        trafficLight.add(1, "ORANGE");
        trafficLight.add(2, "GREEN");
        trafficLight.remove(Integer.valueOf(2));
        trafficLight.remove(2);
        System.out.println(trafficLight);
    }
}

