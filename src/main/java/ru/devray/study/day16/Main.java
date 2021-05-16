package ru.devray.study.day16;

import ru.devray.study.day16.weights.Fruit;
import ru.devray.study.day16.weights.Weights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 200, 1));
        fruits.add(new Fruit("Banana", 190, 2));
        fruits.add(new Fruit("Banana", 220, 1.5));
        fruits.add(new Fruit("Mango", 100, 1));

        Weights w = new Weights();
        w.printCashReceipt(fruits);
    }
}
