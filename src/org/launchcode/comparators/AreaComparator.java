package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        Double a = o1.getArea();
        Double b = o2.getArea();
        return b.compareTo(a);
    }
}
