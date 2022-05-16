package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.time.LocalDate;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        // Задача:  получить 4 продукта с весом не более 600 грамм каждый и проверить чтобы они не были просрочены

    }
}
