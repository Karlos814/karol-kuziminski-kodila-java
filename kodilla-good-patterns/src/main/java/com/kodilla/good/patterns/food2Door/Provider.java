package com.kodilla.good.patterns.food2Door;

public interface Provider {

    boolean isAvailable(int amount, ProductType productType);

    void process(int amount, ProductType productType, InformationService informationService);
}
