package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    private static int testNumber = 1;
    private OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Before
    public void before() {
        System.out.println("Begin test number " + testNumber);
    }

    @After
    public void after() {
        System.out.println("End test number " + testNumber + "!");
        testNumber++;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> empty = new ArrayList<Integer>();
        //When
        List<Integer> control = exterminator.exterminate(empty);
        //Then
        Assert.assertNull(control);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normal = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8, 10);
        //When
        List<Integer> result = exterminator.exterminate(normal);
        //Then
        Assert.assertEquals(expected, result);
    }

}
