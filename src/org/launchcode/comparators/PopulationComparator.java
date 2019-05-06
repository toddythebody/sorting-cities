package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City>{



    @Override
    public int compare(City o1, City o2) {
        Integer a = o1.getPopulation();
        Integer b = o2.getPopulation();
        return b.compareTo(a);
    }
}
