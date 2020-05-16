package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();
    private final String nameOfContinent;

    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }
}
