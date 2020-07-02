package com.kodilla.good.patterns.food2Door;

public class OrdersServis {
    private Provider provider;
    private int amount;
    private ProductType productType;

    public OrdersServis(Provider provider, int amount, ProductType productType) {
        this.provider = provider;
        this.amount = amount;
        this.productType = productType;
    }

    public Provider getProvider() {
        return provider;
    }

    public int getAmount() {
        return amount;
    }

    public ProductType getProductType() {
        return productType;
    }
}
