package com.azzeddine.productapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProductRequest {

    @NotBlank(message = "Product name is required")
    private String name;

    @NotNull(message = "Product price is required")
    @Positive(message = "Product price must be greater than 0")
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}