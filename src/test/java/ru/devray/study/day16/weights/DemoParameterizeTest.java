package ru.devray.study.day16.weights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class DemoParameterizeTest {

    @ParameterizedTest
    @ValueSource(ints = {23, 45, 30})
    void m1(int i){
        System.out.println(i);
        Assertions.assertTrue(i > 0);
    }

    @ParameterizedTest
    @CsvSource({"Banana,30,0.5,15"})
    void testSum(String i1, int price, double weight, int expectedResult){

        System.out.println(new Fruit(i1, price, weight));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/testdata.csv")
    void testSum1(String i1, String i2){
        System.out.println(i1 + i2);
    }

    @ParameterizedTest
    @MethodSource("getFruits")
    void m2(Fruit f){
        System.out.println(f);
    }

    public static List<Fruit> getFruits(){
        return List.of(
            new Fruit("Banana", 50, 0.5),
            new Fruit("Mango", 50, 0.5),
            new Fruit("Banana", 70, 1)
        );
    }



}
