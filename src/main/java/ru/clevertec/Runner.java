package ru.clevertec;


import ru.clevertec.dto.ExpirationDataProduct;
import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

//        Задача:  Найти продукты, срок годности которых заканчивается не раньше июня 2022 г,
//        сформировать новый список продуктов, содержащий название продукта и его срок годности

        List<ExpirationDataProduct> expirationDataProducts = products.stream()
            .filter(product -> product.getMetaInf().getExpirationDate().isAfter(LocalDate.parse("2022-06-30")))
            .map(product -> new ExpirationDataProduct()
                .setName(product.getName())
                .setExpirationDate(product.getMetaInf().getExpirationDate()))
            .peek(System.out::println)
            .collect(Collectors.toList());
    }
}
