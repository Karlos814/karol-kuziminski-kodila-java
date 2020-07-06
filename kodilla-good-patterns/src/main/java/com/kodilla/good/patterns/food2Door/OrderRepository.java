package com.kodilla.good.patterns.food2Door;

public interface OrderRepository {

    static void sendToAccounting(double payment) {
        System.out.println("Zaksięguj kwotę: " + payment);
    }
}
