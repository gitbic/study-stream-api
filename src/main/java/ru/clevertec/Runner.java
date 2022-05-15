package ru.clevertec;

@FunctionalInterface
interface Greeting {
    String sayHallo(String name);
}

public class Runner {

    // Задача: Создать функциональный интерфейс Greeting, с методом sayHallo который принимает строку "имя" и возвращает строку приветствия
    //         С помощью анонимного класса реализовать интерфейс Greeting

    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public String sayHallo(String name) {
                return "Hallo " + name;
            }
        };

        Greeting greeting1 = name -> {
            return "Hello " + name;
        };

        Greeting greeting2 = name -> "Hello " + name;

        System.out.println(greeting.sayHallo("Dima"));
        System.out.println(greeting1.sayHallo("Dima"));
        System.out.println(greeting2.sayHallo("Dima"));
    }
}
