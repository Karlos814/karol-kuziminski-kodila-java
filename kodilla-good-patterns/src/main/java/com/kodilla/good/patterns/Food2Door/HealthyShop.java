package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Provider {
    @Override
    public boolean isAvailable(int amount, ProductType productType) {
        return true;
    }

    @Override
    public void process(int amount, ProductType productType, InformationService informationService) {
        double payment = amount * productType.getPrice();
        OrderRepository.sendToAccounting(payment);
    }
}
