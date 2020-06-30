package com.kodilla.good.patterns.Food2Door;

public class NewProduct extends ProductType {

    public NewProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        String info = "Dziś w promocji "+getName()+" w cenie "+getPrice();
        return info;
    }
}
