package ru.clevertec.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String name;
    private BigDecimal price;
    private int number;
    private MetaInf metaInf;
}
