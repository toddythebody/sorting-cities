package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompondComparator implements Comparator<City> {

    private List<Comparator<City>> comparators= new ArrayList<>();


    public void add(Comparator<City> comparator) {
        comparators.add(comparator);
    }

    @Override
    public int compare(City o1, City o2) {
        for (Comparator<City> comparator : comparators) {
            if (comparator.compare(o1, o2) != 0) {
                return comparator.compare(o1, o2);
            }
        }
        return 0;
    }
}
