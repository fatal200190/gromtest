package Lesson10.abstractbigexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class DeveloperEmployee extends Employee {
    private String[] frameworks = new String[10];

    @Override
    void paySalery() {
        int newBalance = getBankAccount().getBalance() + getSaleryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);

    }
}
