package ru.clevertec;


interface BinaryOperator<T> {
    T apply(T t1, T t2);
}

public class Runner {
    public static void main(String[] args) {

        // Умножить два числа с помощью бинарного оператора

        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        Integer result = multiply.apply(5, 9);

        System.out.println("result = " + result);
    }
}
