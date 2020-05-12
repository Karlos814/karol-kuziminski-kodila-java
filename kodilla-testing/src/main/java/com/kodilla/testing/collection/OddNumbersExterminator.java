package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        if (numbers.isEmpty()) {
            return null;
        }else {
            List<Integer> oddNumbers = new ArrayList<Integer>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    oddNumbers.add(number);
                }
            }
            return oddNumbers;
        }
    }

}
