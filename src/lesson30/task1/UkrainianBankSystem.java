package lesson30.task1;

import java.util.Date;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Alex on 18.09.2017.
 */
public class UkrainianBankSystem implements BankSystem {

    private Set<Transaction>transactions = new TreeSet<>();


    @Override
    public void withdraw(User user, int amount) {
//        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
//        if(amount + user.getBank().getCommission(amount) > limitOfWithdrawal){
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }
//
//        if(amount + user.getBank().getCommission(amount) > user.getBalance()) {
//            printWithdrawalErrorMsg(amount, user);
//            return;
//        }

       if(!checkWithdraw(user,amount))
            return;
       user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));

       createAndSaveTransaction(new Date(),TransactionType.WITHDRAWAL, amount,"sdsdc");
}

    @Override
    public void fund(User user, int amount) {
        if(!checkFundingLimits(user,amount))
            return;
        user.setBalance(user.getBalance() + amount);

        createAndSaveTransaction(new Date(),TransactionType.FUNDING, amount,"sdsdc");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if(!checkWithdraw(fromUser,amount))
            return;

        if(!checkFundingLimits(toUser,amount))
            return;
        if(fromUser.getBank().getCurrency() != toUser.getBank().getCurrency())
            return;


        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);

    }

    @Override
    public void paySalary(User user) {
        if(!checkFundingLimits(user, user.getSalary()))
            return;
        user.setBalance(user.getBalance() + user.getSalary());
    }

    private boolean checkWithdraw(User user, int amount){
        return checkWithdrawLimits(user,amount, user.getBank().getLimitOfWithdrawal()) && checkWithdrawLimits(user,amount, user.getBalance());
    }


    private boolean checkWithdrawLimits(User user, int amount, double limit){
        if(amount + user.getBank().getCommission(amount) > limit){
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printWithdrawalErrorMsg (int amount, User user){
        System.err.println("Can't withdraw money " + amount + "from user " + user.toString());
    }
    private void printFundingErrorMsg (int amount, User user){
        System.err.println("Can't fund money " + amount + "to user " + user.toString());
    }

    private boolean checkFundingLimits(User user, int amount){
        if(amount > user.getBank().getLimitOfFunding()){
            printFundingErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private Transaction createAndSaveTransaction(Date dateCreated, TransactionType type, int amount, String descr){
        Random random = new Random();
        Transaction tr = new Transaction(random.nextInt(), dateCreated, null,type, amount,"sdsdc");
        transactions.add(tr);
        return tr;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}
