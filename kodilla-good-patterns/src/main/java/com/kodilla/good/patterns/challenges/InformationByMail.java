package com.kodilla.good.patterns.challenges;

public class InformationByMail implements InformationService {

    @Override
    public void sendMessage(User user) {
        System.out.println("Wysłanie wiadomości na  adres: " + user.getEmail());
    }
}
