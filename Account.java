package ATMProject;

public abstract class Account {

    private double balance;
    private int pin;

    public Account(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Abstract method → forces child class to implement
    public abstract boolean withdraw(double amount);

    public void deposit(double amount) {
        balance += amount;
    }
}

