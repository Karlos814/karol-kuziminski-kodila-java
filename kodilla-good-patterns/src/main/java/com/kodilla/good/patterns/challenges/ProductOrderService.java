package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = orderService.buy(orderRequest.getUser(), orderRequest.getProductType());

        if (isRented) {
            informationService.sendMessage(orderRequest.getUser());
            orderRepository.addToDataBase(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getDateOfOrder());
            return new OrderDto(orderRequest.getUser());
        } else {
            return new OrderDto(orderRequest.getUser());
        }
    }
}
