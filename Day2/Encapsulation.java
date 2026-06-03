package oopconcept;

class Student {
    
    private int rollNo;
    private String name;

    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();

        s.setRollNo(29);
        s.setName("Sayali");

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
    }
}
