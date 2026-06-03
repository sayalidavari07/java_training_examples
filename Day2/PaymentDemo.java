package oopconcept;

interface Payment {
    void makePayment();
}

class CreditCardPayment implements Payment {

    public void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPIPayment implements Payment {

    public void makePayment() {
        System.out.println("Payment made using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.makePayment();
        p2.makePayment();
    }
}