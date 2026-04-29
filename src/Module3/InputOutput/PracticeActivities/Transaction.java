package Module3.InputOutput.PracticeActivities;

import java.io.File;

public class Transaction implements Persistable{
    public static final String INCOME  = "INCOME";
    public static final String EXPENSE = "EXPENSE";

    private final int id;
    private final double amount;
    private final String type;
    private final String categoryName;
    private final String date;

    public Transaction(int id, double amount, String type, String categoryName, String date) throws IllegalArgumentException{
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.categoryName = categoryName;
        this.date = date;
    }

    @Override
    public int getID() {
        return 0;
    }

}
