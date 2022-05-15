package ru.clevertec;

import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.List;
import java.util.function.Predicate;

public class Runner {

// Задача: Найти продукты с ценой выше 5 и вывести на консоль
// Используя анонимный класс
// Используя лямбду
// Используя предикат

    public static void main(String[] args) {

        List<Product> products = ProductUtils.createProducts();

        products.stream()
            .filter(product -> {
                return product.getPrice() > 5;
            })
            .forEach(product -> System.out.println(product));

        products.stream()
            .filter(product -> product.getPrice() > 5)
            .forEach(System.out::println);

        Predicate<Product> isMoreFive = product -> product.getPrice() > 5;

        products.stream()
            .filter(isMoreFive)
            .filter(product -> isMoreFive.test(product))
            .forEach(System.out::println);
    }
}
