package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.dto.Shop;
import ru.clevertec.util.ProductUtils;

import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        //        Задача:  Найти все продукты в доступные в магазине Алми и посчитать сколько выйдет в сумме за все доступные продукты

        Optional<Double> sum = products.stream()
            .filter(product -> product.getMetaInf().getShopList().contains(Shop.ALMI))
            .map(product -> product.getPrice())
            .reduce((a, b) -> a + b);

        sum.ifPresent(System.out::println);
    }
}
