package com.kodilla.good.patterns.Food2Door;

public class OrdersServis {
    private Provider provider;
    private int amount;
    private ProductType productType;

    public OrdersServis(Provider provider, int amount, ProductType productType) {
        this.provider = provider;
        this.amount = amount;
        this.productType = productType;
    }


}
