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
                .setNumber(2)
                .setMetaInf(new MetaInf()
                    .setWeight(500)
                    .setExpirationDate(LocalDate.parse("2022-06-08"))
                ),
            new Product()
                .setName("apple")
                .setPrice(new BigDecimal("1.24"))
                .setNumber(4)
                .setMetaInf(new MetaInf()
                    .setWeight(500)
                    .setExpirationDate(LocalDate.parse("2022-06-03"))
                ),
            new Product()
                .setName("potato")
                .setPrice(new BigDecimal("0.87"))
                .setNumber(8)
                .setMetaInf(new MetaInf()
                    .setWeight(1000)
                    .setExpirationDate(LocalDate.parse("2022-09-14"))
                ),
            new Product()
                .setName("carrot")
                .setPrice(new BigDecimal("3.51"))
                .setNumber(3)
                .setMetaInf(new MetaInf()
                    .setWeight(1000)
                    .setExpirationDate(LocalDate.parse("2022-09-08"))
                ),
            new Product()
                .setName("orange")
                .setPrice(new BigDecimal("4.18"))
                .setNumber(2)
                .setMetaInf(new MetaInf()
                    .setWeight(500)
                    .setExpirationDate(LocalDate.parse("2022-07-24"))
                ),
            new Product()
                .setName("egg")
                .setPrice(new BigDecimal("1.50"))
                .setNumber(10)
                .setMetaInf(new MetaInf()
                    .setWeight(400)
                    .setExpirationDate(LocalDate.parse("2022-06-25"))
                ),
            new Product()
                .setName("lemon")
                .setPrice(new BigDecimal("3.87"))
                .setNumber(1)
                .setMetaInf(new MetaInf()
                    .setWeight(100)
                    .setExpirationDate(LocalDate.parse("2022-10-10"))
                ),
            new Product()
                .setName("bread")
                .setPrice(new BigDecimal("0.89"))
                .setNumber(1)
                .setMetaInf(new MetaInf()
                    .setWeight(300)
                    .setExpirationDate(LocalDate.parse("2022-05-25"))
                ),
            new Product()
                .setName("milk")
                .setPrice(new BigDecimal("0.96"))
                .setNumber(3)
                .setMetaInf(new MetaInf()
                    .setWeight(900)
                    .setExpirationDate(LocalDate.parse("2022-11-11"))
                ),
            new Product()
                .setName("fish")
                .setPrice(new BigDecimal("5.15"))
                .setNumber(5)
                .setMetaInf(new MetaInf()
                    .setWeight(800)
                    .setExpirationDate(LocalDate.parse("2022-09-26"))
                ),
            new Product()
                .setName("chicken")
                .setPrice(new BigDecimal("6.82"))
                .setNumber(4)
                .setMetaInf(new MetaInf()
                    .setWeight(800)
                    .setExpirationDate(LocalDate.parse("2022-12-17"))
                )
        );
    }
}
