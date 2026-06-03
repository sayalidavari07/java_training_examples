package oopconcept;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class EncapsulationBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber(12345);
        account.setAccountHolder("Sayali");

        account.deposit(10000);
        account.withdraw(3000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());
    }
}