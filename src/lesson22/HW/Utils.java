package lesson22.HW;

/**
 * Created by Alex on 17.11.2017.
 */
public class Utils {
    private static int limitSimpleTransactionAmount = 400;
    private static int limitTransactionsPerDayCount = 100;
    private static int limitTransactionsPerDayAmount = 400;
    private static String[] cities = {"Kiev", "Odessa"};

    public static int getLimitSimpleTransactionAmount() {
        return limitSimpleTransactionAmount;
    }

    public static int getLimitTransactionsPerDayCount() {
        return limitTransactionsPerDayCount;
    }

    public static int getLimitTransactionsPerDayAmount() {
        return limitTransactionsPerDayAmount;
    }

    public static String[] getCities() {
        return cities;
    }
}
