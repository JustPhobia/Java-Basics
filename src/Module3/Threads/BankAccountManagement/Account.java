package Module3.Threads.BankAccountManagement;

import java.util.Random;

public class Account implements  Runnable{
    BankAccount account;
    Integer cash=0;
    String name;

    public Account(BankAccount account, String name){
        this.account = account;
        this.name = name;
    }


    @Override
    public void run() {
        int amount = 0;
        Random rand = new Random();
        while (account.getBalance()-amount>=0) {
            amount = rand.nextInt(100,300);
            cash+=account.withdraw(amount, this.name);
        }
        System.out.println(this.name+" cash: "+ cash);
    }
}
