package Module3.Threads.BankAccountManagement;

public class BankAccount{
    private Integer balance = 1000;
    String name;
    public synchronized Integer withdraw(int amount,String accountName){
        if (balance-amount<0){
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Bank Account Balance: "+balance);
            balance-=amount;
            System.out.println(accountName + " Withdrew: "+amount);
            System.out.println("New Account balance: "+balance);
            System.out.println();
            return amount;
        }
        return 0;
    }

    public Integer getBalance() {
        return balance;
    }
}
