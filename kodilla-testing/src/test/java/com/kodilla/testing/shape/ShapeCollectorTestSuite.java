package com.kodilla.testing.shape;

import org.junit.*;
import com.kodilla.testing.shape.ShapeCollector;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);

        //When
        shapeCollector.addFigure(square);

        //Then
        Assert.assertEquals(1, shapeCollector.figures.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertFalse(shapeCollector.figures.contains(square));
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(10, 5);
        shapeCollector.addFigure(triangle);

        //When
        Shape temporaryFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(triangle, temporaryFigure);
    }
}
