package oopconcept;

abstract class Bank {
    abstract void getInterestRate();
}

class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

class ICICI extends Bank {
    void getInterestRate() {
        System.out.println("ICICI Interest Rate: 6.8%");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        b1.getInterestRate();
        b2.getInterestRate();
        b3.getInterestRate();
    }
}