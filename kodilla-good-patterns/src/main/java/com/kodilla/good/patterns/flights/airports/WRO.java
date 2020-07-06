package com.kodilla.good.patterns.flights.airports;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class WRO implements Airport, AirportService {
    protected final static String city = "Wrocław";
    protected static List<Airport> departures = new ArrayList<>();

    @Override
    public boolean searchTo(Airport city) {
        return departures.contains(city);
    }

    @Override
    public List<Airport> getDepartures() {
        return departures;
    }

    @Override
    public void addFlight(Airport city) {
        departures.add(city);
    }

    @Override
    public void removeFlight(Airport city) {
        departures.remove(city);
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WRO wro = (WRO) o;
        return Objects.equals(city, wro.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    @Override
    public String toString() {
        return "WRO [" + city + "]";
    }
}
