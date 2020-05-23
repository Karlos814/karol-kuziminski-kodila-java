package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("XXX", true);

        for (Map.Entry<String, Boolean> entry: airports.entrySet()) {

            if (entry.getKey().equals(flight.getArrivalAirport()) && entry.getValue()) {
                System.out.println("You can arrival to "+entry.getKey());

            } else if (entry.getKey().equals(flight.getArrivalAirport()) && !entry.getValue()){
                System.out.println("You can't arrival to "+entry.getKey());

            } else {
                throw new RouteNotFoundException("Airport not found");
            }
        }

    }
}
