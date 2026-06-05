package collectionframework;

import java.util.ArrayList;

public class CityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Sangli");
        cities.add("Kolhapur");
        cities.add("Nashik");

        System.out.println("Cities: " + cities);
        System.out.println("Size of ArrayList: " + cities.size());
    }
}