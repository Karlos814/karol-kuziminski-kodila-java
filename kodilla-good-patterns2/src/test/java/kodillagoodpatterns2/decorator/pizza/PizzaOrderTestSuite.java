package kodillagoodpatterns2.decorator.pizza;

import kodillagoodpatterns2.decorator.taxiportal.*;
import org.junit.Test;

import java.awt.*;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaCheeseChickenGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Chicken(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testPizzaCheeseChickenGetDescription(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Chicken(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with: tomato sauce, cheese, chicken", description);
    }

    @Test
    public void testPizzaCheeseProsciuttoThickDoughGetCost(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Prosciutto(thePizza);
        thePizza = new ThickDough(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }

    @Test
    public void testPizzaCheeseProsciuttoThickDoughGetDescription(){
        //Given
        Pizza thePizza = new BasicPizza();
        thePizza = new Cheese(thePizza);
        thePizza = new Prosciutto(thePizza);
        thePizza = new ThickDough(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Pizza with: tomato sauce, cheese, prosciutto on thick dough", description);
    }

}