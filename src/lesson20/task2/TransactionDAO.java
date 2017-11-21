package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Alex on 17.11.2017.
 */
public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();


    public Transaction save(Transaction transaction) throws Exception {

        validate(transaction);

        int index = 0;
        for (Transaction tr : transactions){
            if (tr == null){
                transactions[index] = transaction;
                break;
            }
            index++;
        }
        return transactions[index];
    }


    Transaction[] transactionList() {


        return transactions;
    }

    Transaction[] transactionList(String city) {

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city))
                count++;
        }
        Transaction[] transactionsPerCity = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getCity().equals(city))
                transactionsPerCity[index] = transaction;
            index++;
        }

        return transactionsPerCity;
    }

    Transaction[] transactionList(int amount) {


        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount)
                count++;
        }
        Transaction[] transactionsPerAmount = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null && transaction.getAmount() == amount)
                transactionsPerAmount[index] = transaction;
            index++;
        }

        return transactionsPerAmount;
    }

    private void validate(Transaction transaction) throws Exception {
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceeded " + transaction.getId() + ". Cant't be saved.");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDey(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }
        if ((sum + transaction.getAmount()) > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceeded " + transaction.getId() + ". Cant't be saved.");
        }

        if (count >= utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceeded " + transaction.getId() + ". Cant't be saved.");
        }

        int cityCount = 0;
        for (String city : utils.getCities()) {
            if (city == transaction.getCity())
                cityCount++;
        }
        if (cityCount == 0) {
            throw new BadRequestException("Transaction " + transaction.getId() + " is impossible from this city " + transaction.getCity() + ". Cant't be saved.");
        }

        int countPlaced = 0;
        for (Transaction tr : transactions) {
            if (tr != null)
                countPlaced++;
        }

        if (countPlaced > 9) {
            throw new InternalServerException("Index out of bounds exception. Cant't be saved.");
        }
        for (Transaction tr : transactions){
            if (tr != null && tr.equals(transaction)){
                throw new BadRequestException("Transaction id: "+ transaction.getId() + " is already exist");
            }
        }

    }


    private Transaction[] getTransactionsPerDey(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }

    public TransactionDAO(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public TransactionDAO() {

    }
}
