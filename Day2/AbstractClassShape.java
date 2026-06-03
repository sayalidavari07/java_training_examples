package oopconcept;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class AbstractClassShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.calculateArea();
        s2.calculateArea();
    }
}