package main.java.com.cbfacademy.accounts;

public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(String accountNumber, double initialBalance, double interest) {
        super(accountNumber, initialBalance);
        this.interest = interest;
    }

    public void addInterest() {
        balance += balance * (interest / 100);
    }
}
