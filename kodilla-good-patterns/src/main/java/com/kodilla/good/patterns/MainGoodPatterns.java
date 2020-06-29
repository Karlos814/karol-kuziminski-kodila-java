package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.*;

import java.util.stream.Collectors;

public class MainGoodPatterns {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .map(l -> String.join("!", l))
                .collect(Collectors.joining("!"));

        System.out.println(movies);

        //drugie
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        ProductOrderService productOrderService = new ProductOrderService(new InformationByMail(), new OrderService(), new DataBaseOrders());
        productOrderService.process(orderRequest);

    }
}
