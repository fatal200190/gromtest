package lesson22.HW;

/**
 * Created by Alex on 17.11.2017.
 */
public class Controller {

    public Transaction save(Transaction transaction) throws Exception {

        return TransactionDAO.save(transaction);
    }

    public Transaction[] transactionList() {

        return TransactionDAO.transactionList();
    }

    public Transaction[] transactionList(String city) {

        return TransactionDAO.transactionList(city);
    }

    public Transaction[] transactionList(int amount) {

        return TransactionDAO.transactionList(amount);
    }
}
