package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Provider {

    @Override
    public boolean isAvailable(int amount, ProductType productType) {
        System.out.println("Sprawdzam czy na magazynie jest wystarczająca ilość danego produktu");
        return true;
    }

    @Override
    public void process(int amount, ProductType productType) {
        boolean isInStock = isAvailable(amount, productType);
         if(isInStock) {



         }

    }
}
