package collectionframework;

import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("C++");
        courses.add("HTML");

        courses.add(1, "Python");

        System.out.println("Courses: " + courses);
    }
}