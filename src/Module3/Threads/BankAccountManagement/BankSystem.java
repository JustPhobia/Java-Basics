package Module3.Threads.BankAccountManagement;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Account christineAccount = new Account(account, "Christan");
        Account brandonAccount = new Account(account, "Brandon");

        Thread brandonAcc = new Thread(brandonAccount);
        Thread chrissieAcc = new Thread(christineAccount);

        chrissieAcc.start();
        brandonAcc.start();
    }
}
