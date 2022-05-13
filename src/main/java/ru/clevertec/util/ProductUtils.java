package ru.clevertec.util;

import ru.clevertec.dto.MetaInf;
import ru.clevertec.dto.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ProductUtils {
    public static List<Product> createProducts() {
        return List.of(
            new Product()
                .setName("banana")
                .setPrice(new BigDecimal("2.02"))
                .setWeight(500)
                .setMetaInf(new MetaInf()
                    .setDiscount(true)
                    .setExpirationDate(LocalDate.parse("2022-06-08"))
                ),
            new Product()
                .setName("apple")
                .setPrice(new BigDecimal("1.24"))
                .setWeight(500)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-06-03"))
                ),
            new Product()
                .setName("potato")
                .setPrice(new BigDecimal("0.87"))
                .setWeight(1000)
                .setMetaInf(new MetaInf()
                    .setDiscount(true)
                    .setExpirationDate(LocalDate.parse("2022-09-14"))
                ),
            new Product()
                .setName("carrot")
                .setPrice(new BigDecimal("3.51"))
                .setWeight(1000)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-09-08"))
                ),
            new Product()
                .setName("orange")
                .setPrice(new BigDecimal("4.18"))
                .setWeight(500)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-07-24"))
                ),
            new Product()
                .setName("egg")
                .setPrice(new BigDecimal("1.50"))
                .setWeight(400)
                .setMetaInf(new MetaInf()
                    .setDiscount(true)
                    .setExpirationDate(LocalDate.parse("2022-06-25"))
                ),
            new Product()
                .setName("lemon")
                .setPrice(new BigDecimal("3.87"))
                .setWeight(100)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-10-10"))
                ),
            new Product()
                .setName("bread")
                .setPrice(new BigDecimal("0.89"))
                .setWeight(300)
                .setMetaInf(new MetaInf()
                    .setDiscount(true)
                    .setExpirationDate(LocalDate.parse("2022-05-25"))
                ),
            new Product()
                .setName("milk")
                .setPrice(new BigDecimal("0.96"))
                .setWeight(900)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-11-11"))
                ),
            new Product()
                .setName("fish")
                .setPrice(new BigDecimal("5.15"))
                .setWeight(800)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-09-26"))
                ),
            new Product()
                .setName("chicken")
                .setPrice(new BigDecimal("6.82"))
                .setWeight(800)
                .setMetaInf(new MetaInf()
                    .setDiscount(false)
                    .setExpirationDate(LocalDate.parse("2022-12-17"))
                )
        );
    }
}
