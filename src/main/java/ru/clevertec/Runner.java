package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача: получить список имен товаров со скидкой с помощью for-each и streamApi

        List<String> discountProductNames = new ArrayList<>();

        for (Product product : products) {
            if (product.getMetaInf().isDiscount()) {
                discountProductNames.add(product.getName());
            }
        }

        System.out.println("discountProductNames = " + discountProductNames);
//-----------------------------------------------------------------------
        List<String> discountProductNameList = products.stream()
            .filter(product -> product.getMetaInf().isDiscount())
            .map(product -> product.getName())
            .collect(Collectors.toList());

        System.out.println("discountProductNameList = " + discountProductNameList);
    }

}
