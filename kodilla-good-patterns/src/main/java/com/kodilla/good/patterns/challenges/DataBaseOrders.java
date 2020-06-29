package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class DataBaseOrders implements OrderRepository {

    @Override
    public void addToDataBase(User user, ProductType productType, LocalDateTime dateOfOrder) {
        System.out.println("Tu zostanie zapisana informacja o zamówieniu");
    }
}
