package com.kodilla.good.patterns.flights.airports;

import java.util.List;

public interface Airport {
    boolean searchTo(Airport city);

    List<Airport> getDepartures();

}
