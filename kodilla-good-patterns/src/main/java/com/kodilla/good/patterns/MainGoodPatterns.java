package com.kodilla.good.patterns;

import com.kodilla.good.patterns.Food2Door.*;
import com.kodilla.good.patterns.challenges.*;
import com.kodilla.good.patterns.challenges.InformationByMail;

import java.util.stream.Collectors;

public class MainGoodPatterns {
    public static void main(String[] args) {

        //Modul 13.1
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue())
                .map(l -> String.join("!", l))
                .collect(Collectors.joining("!"));

        System.out.println(movies);

        //Modul 13.2
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        ProductOrderService productOrderService = new ProductOrderService(new InformationByMail(), new OrderService(), new DataBaseOrders());
        productOrderService.process(orderRequest);

        // Modul 13.4
        OrdersServis ordersServis = new OrdersServis(new GlutenFreeShop(), 231, new Eggs("Wolny wybieg", 12));
        ordersServis.getProvider().process(ordersServis.getAmount(), ordersServis.getProductType(), new InformationBySMS());

    }
}
