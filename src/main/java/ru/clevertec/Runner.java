package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.dto.Shop;
import ru.clevertec.util.ProductUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача: Каждый товар продаётся в некоторых магазинах.
        // Необходимо развернуть стримы из магазинов в один стрим.
        // Необходимо подсчитать сколько товаров продаётся в магазине "Два гуся"?
        // Необходимо подсчитать сколько товаров продаётся в каждом магазине

        long DvaGusiaShopCount = products.stream()
            .flatMap(product -> product.getMetaInf().getShopList().stream())
            .filter(shop -> shop.equals(Shop.DVA_GUSIA))
            .count();

        System.out.println("DvaGusiaShopCount = " + DvaGusiaShopCount);


        Map<String, Integer> shopMap = products.stream()
            .flatMap(product -> product.getMetaInf().getShopList().stream())
            .collect(Collectors.toMap(
                shop -> shop.name(),
                shop -> 1,
                (a, b) -> a + 1
            ));

        System.out.println("shopMap = " + shopMap);

    }
}
