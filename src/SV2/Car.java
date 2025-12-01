package SV2;

import java.util.Comparator;
import java.util.LinkedList;

// [James] Car should not implement Comparator, as that is a clear violation of SRP
// The Comparator should be a Class in its own right
public class Car implements Comparable<Car>, Comparator<Car> {
    private String manufacturer;
    private int age;

    public String getManufacturer() { return manufacturer; }
    public int getAge() { return age; }

    // A comparable method can be used to compare items in the collection to keep them ordered
    @Override
    public int compareTo(Car o) {
        return this.manufacturer.compareTo(o.getManufacturer());
    }

    @Override
    public int compare(Car c1, Car c2) {
        int manufacturerCompare = c1.getManufacturer().compareTo(c2.getManufacturer());

        if (manufacturerCompare != 0) {
            return manufacturerCompare;
        }

        return Integer.compare(c1.getAge(), c2.getAge());
    }

}