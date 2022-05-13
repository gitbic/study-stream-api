package ru.clevertec.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MetaInf {
    private int weight;
    private LocalDate expirationDate;
}
