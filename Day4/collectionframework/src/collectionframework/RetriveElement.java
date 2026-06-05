package collectionframework;

import java.util.ArrayList;

public class RetriveElement {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        String fruit = fruits.get(3);

        System.out.println("Element at index 2: " + fruit);
    }
}