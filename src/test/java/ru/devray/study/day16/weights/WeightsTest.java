package ru.devray.study.day16.weights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class WeightsTest {

    static Weights weights;

    @BeforeAll
    static void setUp(){
        weights = new Weights();
    }

    @Test
    @DisplayName("Проверяем что фрукты взвешиваются корректно.")
    void testWeightCalculation(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 50, 0.5));
        fruits.add(new Fruit("Banana", 70, 1));

        double actualResult = weights.weightFruits(fruits);
        double expectedResult = 1.5;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void testPriceCalculation(Pair<List<Fruit>, Integer> testData){
        List<Fruit> fruits = testData.getValue1();
        int expectedPrice = testData.getValue2();
        int actualPrice = weights.calculatePrice(fruits);
        Assertions.assertEquals(expectedPrice, actualPrice, "Общая цена фруктов не соответствует ожидаемой!");
    }

    static List<Pair<List<Fruit>, Integer>> dataProvider(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 50, 0.5));
        fruits.add(new Fruit("Banana", 70, 1));

        List<Fruit> fruits1 = new ArrayList<>();
        fruits1.add(new Fruit("Banana", 200, 0.5));
        fruits1.add(new Fruit("Banana", 100, 1));

        return List.of(
                new Pair(fruits, 95),
                new Pair(fruits1, 200)
        );
    }

    @Test
    void testPriceCalculation2(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 200, 1));
        fruits.add(new Fruit("Mango", 100, 1));

        int actualPrice = weights.calculatePrice(fruits);
        int expectedPrice = 300;
        Assertions.assertEquals(expectedPrice, actualPrice, "Общая цена фруктов не соответствует ожидаемой!");
    }

    @Test
    void testAveragePricePerKg(){
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 50, 0.5));
        fruits.add(new Fruit("Banana", 70, 1));

        int actualPrice = weights.calculatePricePerKg(fruits);
        int expectedPrice = 85;

        Assertions.assertEquals(63, actualPrice);
    }

}
