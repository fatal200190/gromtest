package lesson8.accounts;

/**
 * Created by Alex on 02.08.2017.
 */
public class ChekingAccount extends Account {
    int limitOFExpenses;

    public ChekingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpenses = limitOFExpenses;
    }



    void withdraw(int amount) {
        if(amount > limitOFExpenses)
            return;
        moneyAmount -= amount;
    }

}
