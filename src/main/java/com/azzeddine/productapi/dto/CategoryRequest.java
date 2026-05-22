package com.azzeddine.productapi.dto;

import jakarta.validation.constraints.NotBlank;

public class CategoryRequest {

    @NotBlank(message = "Category name is required")
    private String name;

    public String getName() {
        return name;
    }
}