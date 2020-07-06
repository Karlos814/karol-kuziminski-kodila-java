package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private ProductType productType;
    private LocalDateTime dateOfOrder;

    public OrderRequest(final User user, final ProductType productType, final LocalDateTime dateOfOrder) {
        this.user = user;
        this.productType = productType;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public ProductType getProductType() {
        return productType;
    }
}
