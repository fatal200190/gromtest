package Lesson8.phones;

/**
 * Created by Alex on 02.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110,10.0, "China", true);
        iPhone.deleteIPhoneFromDb();
        iPhone.orderPhone();

    }
}
