package ru.clevertec;

interface Function<T, R> {
    R apply(T t);
}

public class Runner {
    public static void main(String[] args) {

        // Задача: Получить String из числа Double

        Function<Double, String> convert = number -> String.valueOf(number);

        String stringNumber = convert.apply(20.02);

        System.out.println("stringNumber = " + stringNumber);

    }
}
