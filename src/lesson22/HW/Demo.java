package lesson22.HW;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Alex on 21.11.2017.
 */
public class Demo {
    public static void main(String[] args) throws Exception{

        Transaction transaction1 = new Transaction(1001, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction2 = new Transaction(1002, "Odessa", 2, "pass", TransactionType.INCOME, new Date());
        Transaction transaction3 = new Transaction(1003, "Kiev", 1, "pass", TransactionType.INCOME, new Date());
        Transaction transaction4 = new Transaction(1004, "Kiev", 3, "pass", TransactionType.INCOME, new Date());
        Transaction transaction5 = new Transaction(1005, "Kiev", 4, "pass", TransactionType.INCOME, new Date());
        Transaction transaction6 = new Transaction(1006, "Odessa", 6, "pass", TransactionType.INCOME, new Date());
        Transaction transaction7 = new Transaction(1007, "Kiev", 9, "pass", TransactionType.INCOME, new Date());
        Transaction transaction8 = new Transaction(1008, "Kiev", 9, "pass", TransactionType.INCOME, new Date());
        Transaction transaction9 = new Transaction(1009, "Kiev", 5, "pass", TransactionType.INCOME, new Date());
        Transaction transaction10 = new Transaction(1010, "Kiev", 6, "pass", TransactionType.INCOME, new Date());
        Transaction transaction11 = new Transaction(1011, "Kiev", 1, "pass", TransactionType.INCOME, new Date());

        TransactionDAO transactionDAO = new TransactionDAO();
        Controller controller = new Controller();
        System.out.println(Arrays.toString(transactionDAO.getTransactions()));
        controller.save(transaction1);
        controller.save(transaction2);
        controller.save(transaction3);
        controller.save(transaction4);
        controller.save(transaction5);
        controller.save(transaction6);
        controller.save(transaction7);
        controller.save(transaction8);
        controller.save(transaction9);
        controller.save(transaction10);
        System.out.println(Arrays.toString(controller.transactionList()));
        System.out.println(Arrays.toString(controller.transactionList(1)));
        System.out.println(Arrays.toString(controller.transactionList("Odessa")));
        System.out.println(controller.save(transaction10));

    }
}
