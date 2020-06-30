package com.kodilla.good.patterns.flights.airports;


import java.util.ArrayList;
import java.util.List;

public class FlightDatabase {
    protected static List<Airport> airports = new ArrayList<>();

    public FlightDatabase() {
        AirportService airportService = new WAW();
        airportService.addFlight(new WRO());
        airportService.addFlight(new KRK());
        airportService.addFlight(new POZ());

        airportService = new WRO();
        airportService.addFlight(new KRK());
        airportService.addFlight(new WAW());
        airportService.addFlight(new POZ());

        airportService = new POZ();
        airportService.addFlight(new WAW());

        airportService = new KRK();
        airportService.addFlight(new WRO());
        airportService.addFlight(new WAW());

        airports.add(new WAW());
        airports.add(new WRO());
        airports.add(new KRK());
        airports.add(new POZ());
    }

    public List<Airport> getAirports() {
        return airports;
    }
}
