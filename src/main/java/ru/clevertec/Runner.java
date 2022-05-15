package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача: Создать новый список с продуктами со скидкой и вывести его на консоль
        // Создать Новый LinkedHashSet с продуктами с помощью реализации интерфейса Supplier и вывести на консоль

        List<Product> productList = products.stream()
            .filter(product -> product.getMetaInf().isDiscount())
            .collect(Collectors.toList());

        productList.forEach(System.out::println);

        System.out.println("-------------------------------");

        Supplier<LinkedHashSet<Product>> productSupplier = LinkedHashSet::new;

        LinkedHashSet<Product> productSet = products.stream()
            .filter(product -> product.getMetaInf().isDiscount())
            .collect(Collectors.toCollection(productSupplier));

        productSet.forEach(System.out::println);

    }
}
