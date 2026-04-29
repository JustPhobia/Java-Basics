package Module3.InputOutput.PracticeActivities;

public class BankAccount {
    private double balance;
    private final Object balanceLock = new Object();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        synchronized (balanceLock) {
                balance += amount;
        }
    }

    public double getBalance() {
        synchronized (balanceLock) {
            return balance;
        }
    }
}
