package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int [] tab = new int [] {1, 22, 8, 6, 3, 6, 7, 8, 7, 10, 13, 121, 0, 14};
        double expected = 16.1428571;

        //When
        double actual = ArrayOperations.getAverage(tab);

        //Then
        Assert.assertEquals(expected, actual, 0.0001);

    }
}
