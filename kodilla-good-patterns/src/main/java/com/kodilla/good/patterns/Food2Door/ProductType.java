package com.kodilla.good.patterns.Food2Door;

public abstract class ProductType {
    private String name;
    private double price;

    public ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
