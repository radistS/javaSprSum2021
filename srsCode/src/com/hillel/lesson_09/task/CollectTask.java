package com.hillel.lesson_09.task;


import java.util.ArrayList;
import java.util.List;

// Мотоциклист. Определить иерархию амуниции. Экипировать мотоциклиста.
// Подсчитать стоимость. Провести сортировку амуниции на основе веса.
// Найти элементы амуниции, соответствующие заданному диапазону параметров цены.
public class CollectTask {

   static public List<Amunition> list = new ArrayList<>();

    public static void main(String[] args) {

        list.add(new Amunition(Type.SHLEM, "helm", 2.5, 100));
        list.add(new Amunition(Type.BRUKI, "leather tr", 10, 100));
        list.add(new Amunition(Type.KURTKA, "kosuxa", 15, 100));
        list.add(new Amunition(Type.ZACHITA, "turtles", 11, 100));
        list.add(new Amunition(Type.PERCHATKI, "perchi", 2, 100));

        cena(1500, 2900);

        System.out.println(stoimost());
    }

    private static double stoimost(){
        return list.stream()
                .map(Amunition::getPrice)
                .mapToInt(i -> Integer.parseInt(i.toString()))
                .sum();
    }

    private static void cena(int min, int max){
        for (Amunition a : list){
            if (min <= a.getPrice() && max >= a.getPrice()){
                System.out.println(a);
            }
        }

    }
}

class Amunition{
    private Type type;
    private String name;
    private double weight;
    private int price;

    public Amunition() {
    }

    public Amunition(Type type, String name, double weight, int price) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Amunition{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}

enum Type {
    SHLEM, KURTKA, PERCHATKI, BRUKI, ZACHITA;
}