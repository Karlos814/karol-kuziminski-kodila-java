package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements Provider {

    @Override
    public boolean isAvailable(int amount, ProductType productType) {
        return true;
    }

    @Override
    public void process(int amount, ProductType productType, InformationService informationService) {
        boolean isInStock = isAvailable(amount, productType);
        if(isInStock) {
            informationService.sendMessage();
            InformationBySMS.sendPromotionMessage(new NewProduct("Kaszanka", 3.99));
        }
    }
}
