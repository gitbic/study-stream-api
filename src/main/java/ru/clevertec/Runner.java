package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.time.LocalDate;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача:  получить 4 продукта с весом не более 600 грамм каждый и проверить чтобы они не были просрочены

        boolean okOrder = products.stream()
            .filter(product -> product.getWeight() < 600)
            .peek(System.out::println)
            .limit(4)
            .allMatch(product -> LocalDate.now().isBefore(product.getMetaInf().getExpirationDate()));

        System.out.println("okOrder = " + okOrder);
    }
}
