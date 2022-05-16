package ru.clevertec;


import ru.clevertec.dto.Product;
import ru.clevertec.util.ProductUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return Double.compare(product1.getPrice(), product2.getPrice());
    }
}

// Написать свой компаратор для сравнения цены на продукт
// Найти минимальную цену товара с помощью компаратора и получения первого элемента
// Найти максимальную цену товара с помощью анонимного класса и лямбды


public class Runner {
    public static void main(String[] args) {
        List<Product> products = ProductUtils.createProducts();


        Optional<Product> min = products.stream()
            .sorted(new ProductPriceComparator())
            .findFirst();

        System.out.println("min = " + min);

        Optional<Product> max = products.stream()
            .max(new Comparator<Product>() {
                @Override
                public int compare(Product p1, Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
            });

        System.out.println("max = " + max);

    }
}
