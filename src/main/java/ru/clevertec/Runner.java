package ru.clevertec;

interface Consumer<T> {
    void accept(T t);
}

public class Runner {
    public static void main(String[] args) {

        // Реализовать функциональный интерфейс Consumer, который напечатает 100 долларов

        Consumer<Integer> printer = integer -> System.out.println(integer + " dollars");

        printer.accept(100);

    }
}
