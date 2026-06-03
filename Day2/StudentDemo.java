package oopconcept;

class StudentApp {
    private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        StudentApp s = new StudentApp();

        s.setRollNo(29);
        s.setName("Sayali");
        s.setMarks(85.5);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}