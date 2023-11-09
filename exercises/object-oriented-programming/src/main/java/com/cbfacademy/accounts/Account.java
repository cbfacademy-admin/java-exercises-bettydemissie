package main.java.com.cbfacademy.accounts;

public class Account {
    
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = 0;

    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {

        // double withdrawal = Math.abs(amount);
        if (amount <= balance) 
        {
            balance -= amount;
            return withdrawal;
        }
        else 
        {
            System.out.println("Insufficient funds!");
            return 0;
        }
        
    }

}
