package collectionframework;

import java.util.ArrayList;

public class StudentsName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Sayali");
        students.add("tehseen");
        students.add("Shreya");
        students.add("Tanuja");
        students.add("Priya");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}