package com.kodilla.good.patterns.challenges;

public class Tshirts extends ProductType {
    private double price;
    private String name;
    private int size;

    public Tshirts(double price, String name, int size) {
        super(price, name);
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
