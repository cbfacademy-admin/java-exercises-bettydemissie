package main.java.com.cbfacademy.accounts;

public class CurrentAccount extends Account {

    private int overdraftLimit= -200;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void overdraftLimit() {
        if (this.balance <= overdraftLimit) {
            System.out.println("Overdraft has been reached");
        }
        else{
            System.out.println("Go Ahead!");
        }
    }
}


