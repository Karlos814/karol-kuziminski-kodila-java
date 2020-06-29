package com.kodilla.good.patterns.challenges;

public class Trousers extends ProductType {
    private double price;
    private String name;
    private String color;

    public Trousers(double price, String name, String color) {
        super(price, name);
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
