package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

    }
}
