package com.kodilla.good.patterns.flights;

import com.kodilla.good.patterns.flights.airports.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private FlightDatabase flightDatabase;

    public FlightService(FlightDatabase flightDatabase) {
        this.flightDatabase = flightDatabase;
    }

    public List<Airport> searchCity(Airport searchCity) {
        List<Airport> cityList = flightDatabase.getAirports().stream()
                .filter(e -> e.searchTo(searchCity))
                .collect(Collectors.toList());
        System.out.println(cityList);
        return cityList;
    }

    public List<Airport> searchIndirectFlight(Airport departure, Airport arrival) {
        List<Airport> indirectCity = new ArrayList<>();
        if(!departure.searchTo(arrival)){
            indirectCity = flightDatabase.getAirports().stream()
                    .filter(d -> d.equals(departure))
                    .flatMap(a -> a.getDepartures().stream())
                    .filter(e -> e.searchTo(arrival))
                    .collect(Collectors.toList());
        System.out.println(indirectCity);
        } else {
            indirectCity.add(arrival);
        }
        return indirectCity;
    }

}
