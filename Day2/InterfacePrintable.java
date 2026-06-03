package oopconcept;

interface PrintableDemo {
    void print();
}

class Document implements PrintableDemo {
    public void print() {
        System.out.println("Printing Document...");
    }
}

public class InterfacePrintable{
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}