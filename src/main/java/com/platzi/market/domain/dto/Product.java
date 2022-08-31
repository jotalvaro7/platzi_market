package com.platzi.market.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long productId;
    private String name;
    private int categoryId;
    private double price;
    private boolean active;
    private Category category;
}
