package com.platzi.market.domain.dto;

import lombok.Data;


@Data
public class Category {
    private Long categoryId;
    private String category;
    private boolean active;
}
