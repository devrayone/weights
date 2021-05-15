package ru.devray.study.day16.example;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class SimpleTest {

    StringConcatenator sc;

    @BeforeEach
    void setUp(){
        sc = new StringConcatenator();
    }

    @Test
    @DisplayName("Тестируем конкатенацию двух валидных строк")
    void testConcatenate(){
        String result = sc.concatenateStrings("123", "456");
        System.out.println(result);
        Assertions.assertEquals(result, "123456");
    }

    @Test
    void testConcatWithNullValues(){
        Assertions.assertThrows(RuntimeException.class, ()-> {
            sc.concatenateStrings(null, null);
        });
    }

    @Test
    @DisplayName("Проверяем сумму длин строк")
    void testLength(){
        int sum = sc.countSumLength("asd", "13243");
    }




}
