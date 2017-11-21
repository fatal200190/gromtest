package lesson20.task2;

/**
 * Created by Alex on 17.11.2017.
 */
public class Utils {
    private int limitSimpleTransactionAmount = 10;
    private int limitTransactionsPerDayCount = 10;
    private int limitTransactionsPerDayAmount = 40;
    private String[] cities = {"Kiev", "Odessa"};

    public int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public int getLimitTransactionsPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public int getLimitTransactionsPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public String[] getCities() {
        return cities;
    }
}
