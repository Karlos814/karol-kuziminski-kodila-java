package com.kodilla.good.patterns.Food2Door;

public class InformationByMail implements InformationService{
    @Override
    public void sendMessage() {
        System.out.println("Wysłanie maila o przyjęciu zamówienia");
    }
}
