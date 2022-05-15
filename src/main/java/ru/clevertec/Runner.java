package ru.clevertec;

import java.time.LocalTime;

interface Supplier<T> {
    T get();
}
public class Runner {
    public static void main(String[] args) {

        // Задача сгенерировать текущее время при помощи интерфейса Supplier

        Supplier<LocalTime> time = LocalTime::now;

        LocalTime localTime = time.get();

        System.out.println("localTime = " + localTime);

    }
}
