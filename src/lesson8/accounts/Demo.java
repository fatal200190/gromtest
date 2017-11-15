package lesson8.accounts;

/**
 * Created by Alex on 02.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBank", "Denis", 1000,50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);
        savingAccount.changeOwnerName("Oleg");
        System.out.println(savingAccount.ownerName);

        //---------------------------------------------------

        ChekingAccount chekingAccount = new ChekingAccount("SomeBank", "Denis", 800,500);

        chekingAccount.changeOwnerName("Oleg");
        System.out.println(chekingAccount.ownerName);

        //***depositMoney кейс
        //ополнение счета +
        //результат пополнения больше инта +


        Account account = new Account("Aval","Ben",2000000000);

        account.depositMoney(200);
        System.out.println(account.moneyAmount);

        account.depositMoney(2000000000);
        System.out.println(account.moneyAmount);

        //***withdraw кейс
        //нятие со счета +
        //сумма больше лимита +
        //сумма больше остатка+

        chekingAccount.withdraw(500);
        System.out.println(chekingAccount.moneyAmount);

        chekingAccount.withdraw(600);
        System.out.println(chekingAccount.moneyAmount);

        chekingAccount.withdraw(500);
        System.out.println(chekingAccount.moneyAmount);

        //***changeOwnerName кейс
        //смена имени противоречит условию+
        //смена имени не противоречит условию+

        savingAccount.changeOwnerName("Victor");
        savingAccount.changeOwnerName("Ann");
        System.out.println(savingAccount.ownerName);

    }
}
