package lesson20.task2;

/**
 * Created by Alex on 17.11.2017.
 */
public class Utils {
    private int limitSimpleTransactionAmount = 400;
    private int limitTransactionsPerDayCount = 100;
    private int limitTransactionsPerDayAmount = 400;
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
