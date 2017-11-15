package lesson8.phones;

/**
 * Created by Alex on 02.08.2017.
 */
public class IPhone extends Phone{
    int price;
    double weight;
    String countryProduced;

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    void deleteIPhoneFromDb (){
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}
