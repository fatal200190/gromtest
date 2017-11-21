package lesson20.task2;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Alex on 21.11.2017.
 */
public class Demo {
    public static void main(String[] args) throws Exception{

        Transaction transaction1 = new Transaction(1001, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(1002, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(1003, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction4 = new Transaction(1004, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(1005, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction6 = new Transaction(1006, "Kiev", 6, "pass", TransactionType.INCOME, new Date());
        Transaction transaction7 = new Transaction(1007, "Kiev", 9, "pass", TransactionType.INCOME, new Date());
        Transaction transaction8 = new Transaction(1008, "Kiev", 9, "pass", TransactionType.INCOME, new Date());
        Transaction transaction9 = new Transaction(1009, "Kiev", 9, "pass", TransactionType.INCOME, new Date());
        Transaction transaction10 = new Transaction(1010, "Kiev", 2, "pass", TransactionType.INCOME, new Date());
        Transaction transaction11 = new Transaction(1011, "Kiev", 1, "pass", TransactionType.INCOME, new Date());

        TransactionDAO transactionDAO = new TransactionDAO();
        System.out.println(Arrays.toString(transactionDAO.getTransactions()));
        transactionDAO.save(transaction1);
        transactionDAO.save(transaction2);
        transactionDAO.save(transaction3);
        transactionDAO.save(transaction4);
        transactionDAO.save(transaction5);
        transactionDAO.save(transaction6);
        transactionDAO.save(transaction7);
        transactionDAO.save(transaction8);
        transactionDAO.save(transaction9);
        transactionDAO.save(transaction10);
//        transactionDAO.save(transaction11);

        System.out.println(Arrays.toString(transactionDAO.getTransactions()));












    }
}
