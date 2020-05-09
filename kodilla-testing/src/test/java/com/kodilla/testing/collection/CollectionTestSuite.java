package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {
    private static int testNumber = 1;
    private OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Begin test number "+testNumber);
    }

    @After
    public void after(){
        System.out.println("End test number "+testNumber+"!");
        testNumber++;
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        ArrayList<Integer> empty = new ArrayList<Integer>();
        Assert.assertNull(exterminator.exterminate(empty));
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> normal = new ArrayList<Integer>(Arrays.asList((new Integer[]{1,2,3,4,5,6,7,8,9,10})));
        ArrayList<Integer> test = exterminator.exterminate(normal);
        for (Integer odd:test){
            Assert.assertTrue(odd%2 == 0);
        }
    }

}
