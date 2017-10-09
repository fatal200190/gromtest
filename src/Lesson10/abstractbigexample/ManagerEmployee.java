package Lesson10.abstractbigexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class ManagerEmployee extends Employee {

    @Override
    void paySalery() {
        int newBalance = getBankAccount().getBalance() + getSaleryPerMonth();
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
