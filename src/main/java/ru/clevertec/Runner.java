package ru.clevertec;

@FunctionalInterface
interface Predicate<T> {
    boolean test(T t);
}

public class Runner {

    // Задача: реализовать функциональный интерфейс Predicate для проверки числа, чтобы оно было больше 5

    public static void main(String[] args) {
        Predicate<Integer> isMoreFive = integer -> integer > 5;

        System.out.println("isMoreFive.test(3) = " + isMoreFive.test(3));
        System.out.println("isMoreFive.test(7) = " + isMoreFive.test(7));
    }
}
