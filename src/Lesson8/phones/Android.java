package Lesson8.phones;

/**
 * Created by Alex on 02.08.2017.
 */
public class Android extends Phone {
    String androidVersion;
    int screenSize;

    String secretDeviseCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
        //this.price = price;
        //this.weight = weight;
        //this.countryProduced = countryProduced;

        super(price,weight,countryProduced);

        //this - reference to the current class object
        //super - reference to the parent class object

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

    void installNewAndriodVersion(){
        System.out.println("installNewAndroidVersion invoked...");
    }
}
