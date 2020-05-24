package com.kodilla.exception.test;

public class FirstChallenge {
        public static void main(String[] args) {

            //Zadanie z modulu 8.4
            Flight flight = new Flight("WAW", "DXB");
            FlightSearch flightSearch = new FlightSearch();

            try {
                flightSearch.findFilght(flight);

            } catch (RouteNotFoundException e) {
                System.out.println("Airport not found");
            }

        }
}
