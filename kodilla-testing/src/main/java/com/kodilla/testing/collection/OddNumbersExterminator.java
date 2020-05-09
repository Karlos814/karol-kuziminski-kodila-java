package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        if (numbers.isEmpty()) {
            return null;
        }else {
            ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
            for (Integer number : numbers) {
                if ((number % 2 == 0) || (number == 0)) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }

}
