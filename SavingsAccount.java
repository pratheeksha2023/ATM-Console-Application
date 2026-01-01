package ATMProject;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance, int pin) {
        super(balance, pin);
    }

    // Polymorphism: overridden method
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            return false;
        }
        setBalance(getBalance() - amount);
        return true;
    }
}

