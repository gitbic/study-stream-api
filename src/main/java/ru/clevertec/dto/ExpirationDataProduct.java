package ru.clevertec.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpirationDataProduct {
    private String name;
    private LocalDate expirationDate;
}
