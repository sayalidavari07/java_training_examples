package oopconcept;

abstract class Staff {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Staff {
    int monthlySalary = 50000;

    void calculateSalary() {
        System.out.println("Full Time Employee Salary = " + monthlySalary);
    }
}


class PartTimeEmployee extends Staff {
    int hoursWorked = 40;
    int ratePerHour = 200;

    void calculateSalary() {
        int salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Employee Salary = " + salary);
    }
}

public class StaffDemo {
    public static void main(String[] args) {

        Staff e1 = new FullTimeEmployee();
        Staff e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}