package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egypt", new BigDecimal("970410720")));
        africa.addCountry(new Country("South Africa", new BigDecimal("548415520")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("1906322610")));
        africa.addCountry(new Country("Burkina Faso", new BigDecimal("201075090")));
        world.addContinent(africa);

        Continent americas = new Continent("Americas");
        americas.addCountry(new Country("Argentina", new BigDecimal("40913584")));
        americas.addCountry(new Country("Columbia", new BigDecimal("43677372")));
        americas.addCountry(new Country("USA", new BigDecimal("308878120")));
        americas.addCountry(new Country("Canada", new BigDecimal("33989040")));
        world.addContinent(americas);

        Continent europe = new Continent("Europe");
        europe.addCountry((new Country("Poland", new BigDecimal("38346270"))));
        europe.addCountry((new Country("Italy", new BigDecimal("61680122"))));
        europe.addCountry((new Country("Spain", new BigDecimal("47737941"))));
        europe.addCountry((new Country("Czech Republic", new BigDecimal("10627448"))));
        world.addContinent(europe);

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1330044605")));
        asia.addCountry(new Country("Japan", new BigDecimal("127078679")));
        asia.addCountry(new Country("South Korea", new BigDecimal("48975000")));
        world.addContinent(asia);

        //When
        BigDecimal populationOfTheWorld = world.getPeopleQuantity();


        //Then
        BigDecimal myCalculations = new BigDecimal("5718172121");
        Assert.assertEquals(myCalculations, populationOfTheWorld);
    }
}
