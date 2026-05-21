package com.azzeddine.productapi.dto;

public class ProductResponse {

    private Long id;
    private String name;
    private Double price;
    private String categoryName;

    public ProductResponse(Long id, String name, Double price, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategoryName() {
        return categoryName;
    }
}