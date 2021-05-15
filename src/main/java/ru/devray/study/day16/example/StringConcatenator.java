package ru.devray.study.day16.example;


public class StringConcatenator {

    /**
     * Метод, который будет складывать две строки.
     * В случае, если обе строки пустые или не проинициализированы - выбрасывать exception.
     * В случае, если одна строка пустая или не проинициализирована - возвращать непустую строку из этой пары.
     */
    public String concatenateStrings(String str1, String str2){
        if (str1 == null && str2 == null){
            throw new RuntimeException("Обе строки непроинициализированы!");
        }
        if (str1.isEmpty() && str2.isEmpty()){
            throw new RuntimeException("Обе строки пустые!");
        }
        if (str1.isEmpty() || str1 == null) {
            return str2;
        }
        if (str2.isEmpty() || str2 == null) {
            return str1;
        }
        return str1 + str2;
    }

    /**
     * Считаем общее количество букв в двух словах
     * @param str1
     * @param str2
     */
    public int countSumLength(String str1, String str2){
        return str1.length() + str2.length();
    }

}
