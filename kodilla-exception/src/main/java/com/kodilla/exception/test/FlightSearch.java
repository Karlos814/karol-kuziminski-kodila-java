package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("XXX", true);
        airports.put("BBB", false);
        airports.put("MMM", false);
        airports.put("KKK", true);
        airports.put("SSS", true);
        airports.put("WWW", true);
        airports.put("PPP", true);
        airports.put("OMG", true);

        if (!(airports.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException("Not found");

        } else {
            airports.entrySet().stream()
                    .filter(entry -> entry.getKey().equals(flight.getArrivalAirport()))
                    .map(e -> e.getKey() + " airport serves the selected flight - " + e.getValue())
                    .forEach(System.out::println);
        }
    }
}
