package com.kodilla.exception.test;

public class FirstChallenge {
        public double divide(double a, double b) throws ArithmeticException {
            if(b == 0){
                throw new ArithmeticException();
            }
            return a / b;
        }

        /**
         * This main can throw an ArithmeticException!!!
         * @param args
         */
        public static void main(String[] args) {

            FirstChallenge firstChallenge = new FirstChallenge();

            try {
                double result = firstChallenge.divide(3, 0);
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("U mustn't divide by zero");

            } finally {
                System.out.println("Task completed");
            }

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
