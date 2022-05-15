package ru.clevertec;


interface UnaryOperator<T> {
    T apply(T t);
}

public class Runner {
    public static void main(String[] args) {

        // Получить квадрат числа с помощью унарного оператора

        UnaryOperator<Integer> square = x -> x*x;

        Integer result = square.apply(5);

        System.out.println("result = " + result);
    }
}
