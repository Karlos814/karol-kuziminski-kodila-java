package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {
    void addToDataBase(User user, ProductType productType, LocalDateTime dateOfOrder);
}
