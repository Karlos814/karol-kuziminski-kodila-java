package com.kodilla.good.patterns.challenges;

public abstract class ProductType {
    private double price;
    private String name;

    public ProductType(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
