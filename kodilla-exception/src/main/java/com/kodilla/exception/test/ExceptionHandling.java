package com.kodilla.exception.test;

public class ExceptionHandling {
    public void handling () {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(10, 20);

        } catch (Exception e) {
            System.out.println("We have a problem...");

        } finally {
            System.out.println("At the end!");
        }
    }
}
