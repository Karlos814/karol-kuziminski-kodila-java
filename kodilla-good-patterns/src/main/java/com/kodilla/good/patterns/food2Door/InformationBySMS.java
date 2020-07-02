package com.kodilla.good.patterns.food2Door;

public class InformationBySMS implements InformationService {

    @Override
    public void sendMessage() {
        System.out.println("Wysłanie SMS o przyjęciu zamówienia");
    }

    public static void sendPromotionMessage(NewProduct newProduct) {
        System.out.println("Wysłanie SMS o nowych produktach "+newProduct.toString());
    }
}
