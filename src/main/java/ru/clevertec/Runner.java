package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.List;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();

        //Задача: Вывести на консоль имя продукта и его стоимость
        //        Для этого написать Consumer отдельно
        //        Уменьшить цену для товаров на скидке на 10%
        //        Вывести на консоль имя продукта и его стоимость

        Consumer<Product> printedProduct =
            product -> System.out.println(product.getName() + " cost: " + product.getPrice());

        products.stream()
            .peek(printedProduct)
            .peek(product -> {
                double price = product.getPrice();
                product.setPrice(price - price / 10);
            })
            .forEach(printedProduct);
    }
}
