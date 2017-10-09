package Lesson10.HW;

import java.util.Date;

/**
 * Created by Alex on 21.08.2017.
 */
public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    void calculatePrice() {
        if(checkCityFrom()&&checkPrice()&&checkName()&&checkGender()){
            setDateConfirmed(new Date());
        }
        else System.out.println("Error");

    }

    @Override
    void validateOrder() {
        double total;
        if(getBasePrice() < 5000){
            total = getBasePrice() + (getBasePrice() * 0.05);
        }
        else
            total = getBasePrice() + (getBasePrice() * 0.02);
        setTotalPrice(total);
    }

    boolean checkCityFrom () {
        return (getShipFromCity().equals("Kiev") || getShipFromCity().equals("Lvov")) && (getShipToCity() != null);
    }
    boolean checkPrice (){
        return getBasePrice() >= 500;
    }
    boolean checkName(){
        return getCustomerOwned().getName() != "Test";
    }
    boolean checkGender (){
        return getCustomerOwned().getGender() != null;
    }
}
