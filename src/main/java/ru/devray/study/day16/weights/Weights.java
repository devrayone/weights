package ru.devray.study.day16.weights;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public void printCashReceipt (List<Fruit> fruits) {
        Map<String, List<Fruit>>  groupOfFruits = fruits.stream().collect(Collectors.groupingBy(f -> f.getName()));
        groupOfFruits.forEach((name, list) -> {
            System.out.println(name);
            list.forEach(fruit -> System.out.println(fruit));
            System.out.println(
                "Вес: " + list.stream().mapToDouble(f -> f.getWeight() ).sum() + " кг; " +
                "Стоимость: " + list.stream().mapToDouble(f -> f.getPricePerKg() * f.getWeight() ).sum() + " руб;"
            );
        });
    }

}
