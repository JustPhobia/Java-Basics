package Module3.InputOutput.PracticeActivities;

import java.util.ArrayList;
import java.util.List;

public class TransactionStorage {
    private List<Transaction>  transactions = new ArrayList<Transaction>();
    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printTransactions() {
        for (Transaction transaction : transactions)
            System.out.println(transaction);
    }
}
