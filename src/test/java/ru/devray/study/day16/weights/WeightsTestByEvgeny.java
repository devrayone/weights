package ru.devray.study.day16.weights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class WeightsTestByEvgeny {

    static Weights weights;

    @BeforeAll
    static void setUp(){
        weights = new Weights();
    }

    @Test
    @DisplayName("Проверяем взвешивание \"пустого\" пакета")
    void testEmptyPackageWeightCalculation(){
        List<Fruit> fruits = new ArrayList<>();
        Assertions.assertDoesNotThrow(() -> weights.weightFruits(fruits), "Взвешивание \"пустого\" пакета вызвало исключение" );
        double actualResult = weights.weightFruits(fruits);
        double expectedResult = 0;
        Assertions.assertEquals(expectedResult, actualResult, "Некорректный результат при взвешивании \"пустого\" пакета");
    }

}

