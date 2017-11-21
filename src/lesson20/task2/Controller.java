package lesson20.task2;

/**
 * Created by Alex on 17.11.2017.
 */
public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public Transaction save(Transaction transaction) throws Exception {

        return transactionDAO.save(transaction);
    }

    Transaction[] transactionList() {

        return transactionDAO.transactionList();
    }

    Transaction[] transactionList(String city) {

        return transactionDAO.transactionList(city);
    }

    Transaction[] transactionList(int amount) {
        return transactionDAO.transactionList(amount);
    }
}