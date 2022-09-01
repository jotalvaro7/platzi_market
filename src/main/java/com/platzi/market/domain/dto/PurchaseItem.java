package com.platzi.market.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseItem {
    private int productId;
    private int quantity;
    private BigDecimal total;
    private boolean estado;
}
