package ru.clevertec;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

public class Runner {

    // Задача: реализовать функциональный интерфейс Predicate для проверки числа, чтобы оно было больше 5
}
