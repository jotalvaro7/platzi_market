package com.platzi.market.domain.dto;

import lombok.Data;

@Data
public class Product {
    private long productId;
    private String name;
    private int categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;
}
