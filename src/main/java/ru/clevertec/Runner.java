package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.List;

// Написать свой компаратор для сравнения цены на продукт
// Найти минимальную цену товара с помощью компаратора и получения первого элемента
// Найти максимальную цену товара с помощью анонимного класса и лямбды


public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

    }
}
