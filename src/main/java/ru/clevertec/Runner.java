package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача: Каждый товар продаётся в некоторых магазинах.
        // Необходимо развернуть стримы из магазинов в один стрим.
        // Необходимо подсчитать сколько наименований товара продаётся в каждом магазине.

    }
}
