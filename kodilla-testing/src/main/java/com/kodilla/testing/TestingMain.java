package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 28);
        int subtractResult = calculator.subtract(25, 5);

        //test dodawania
        if (addResult==33){
            System.out.println("add test OK");
        } else System.out.println("Error! - add");

        //test odejmowania
        if (subtractResult==20){
            System.out.println("subtract test OK");
        } else System.out.println("Error! - subtract");
    }
}
