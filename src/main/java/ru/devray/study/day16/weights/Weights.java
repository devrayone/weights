package ru.devray.study.day16.weights;

import java.util.List;

public class Weights {
    public double weightFruits(List<Fruit> fruits) {
        return fruits.stream().mapToDouble(f -> f.getWeight()).sum();
    }

    public int calculatePrice(List<Fruit> fruits) {
        return fruits.stream().mapToInt(f -> (int) (f.getWeight() * f.getPricePerKg())).sum();
    }

    public int calculatePricePerKg(List<Fruit> fruits) {
        return (int) (calculatePrice(fruits)/weightFruits(fruits));
    }
}
