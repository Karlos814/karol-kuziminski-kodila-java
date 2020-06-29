package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retriever() {
        User user = new User("Karol", "Ku", "kodila", "karol@gmail.com");
        LocalDateTime dateOfOrder = LocalDateTime.now();
        ProductType tshirt = new Tshirts(123, "balenciaga", 42);

        return new OrderRequest(user, tshirt, dateOfOrder);
    }
}
