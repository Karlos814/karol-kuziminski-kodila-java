package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;

    public OrderDto(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
