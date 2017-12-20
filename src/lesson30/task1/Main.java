package lesson30.task1;


/**
 * Created by Alex on 18.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "Sweden", Currency.EUR, 100, 1400,4,444343434);
        Bank euBank = new EUBank(1223, "Poland", Currency.USD, 150, 1500,3,56486144);
        Bank chinaBank = new ChinaBank(1224,"China",Currency.USD,200,1800,5,789789789);

        User user = new User(1001, "Denis", 12200, 40, "GMD",1500, usBank);
        User user1 = new User(1002, "Bob", 15000, 24, "GMC",2000, euBank);
        User user2 =new User(1003,"Alex",20000,36,"DCC",1800,chinaBank);



        BankSystem bankSystem = new UkrainianBankSystem();

        //***withdraw кейс
        //снятие со счета+
        //снятие отрицательного значения -
        //недостаточно на счету +

        bankSystem.withdraw(user,200);
        System.out.println(user.getBalance());

        bankSystem.withdraw(user,-10);
        System.out.println(user.getBalance());

        bankSystem.withdraw(user,12000);
        System.out.println(user.getBalance());

        //***fund кейс
        //пополнение счета+
        //пополнение отрицательного значения -
        //лимит перевода +

        bankSystem.fund(user1,200);
        System.out.println(user1.getBalance());

        bankSystem.fund(user1,-200);
        System.out.println(user1.getBalance());

        bankSystem.fund(user1,20000);
        System.out.println(user1.getBalance());

        ///***transferMoney кейс
        //перевод денег +
        //перевод разных валют +
        //перевод больше чем баланс +

        bankSystem.transferMoney(user1,user2,100);
        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());

        bankSystem.transferMoney(user,user1,100);

        bankSystem.transferMoney(user1,user2,15000);
        System.out.println(user1.getBalance());
        System.out.println(user2.getBalance());

        //***paySalary
        //выплата зарплаты +
        //віплата больше лимита +
        //перевод отрицательный -

        bankSystem.paySalary(user2);
        System.out.println(user2.getBalance());

        user2.setSalary(12000);

        bankSystem.paySalary(user2);
        System.out.println(user2.getBalance());

        user2.setSalary(-2000);

        bankSystem.paySalary(user2);
        System.out.println(user2.getBalance());




//        bankSystem.withdraw(user,150);
//
//        Sys.out.println(user.getBalance());

//        bankSystem.fund(user,10001);
//
//        Sys.out.println(user.getBalance());

//        bankSystem.transferMoney(user,user1,100);
//        Sys.out.println(user.getBalance());
//        Sys.out.println(user1.getBalance());
//
//        bankSystem.paySalary(user1);
//        Sys.out.println(user1.getBalance());
    }
}
