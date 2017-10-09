package Lesson10.HW;

import java.util.Date;

/**
 * Created by Alex on 21.08.2017.
 */
public class ElectronicsOrder extends Order {
    int guaranteeMonth;


    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonth) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonth = guaranteeMonth;
    }

    @Override
    public void validateOrder() {
        if(checkCityFromTo() && checkPrice() && checkName() && checkGender()){
            setDateConfirmed(new Date());
        }
        else
            System.out.println("Error");
    }

    @Override
    void calculatePrice() {
        double total;
        if(getBasePrice() > 1000){
           total = (getBasePrice() - (getBasePrice() * 0.05)) + calculateDeliveryPrice();
        }
        else
            total = getBasePrice() + calculateDeliveryPrice();

        setTotalPrice(total);
    }

    boolean checkCityFromTo () {
       return
               (getShipToCity().equals("Kiev") || getShipToCity().equals("Odessa") || getShipToCity().equals("Dnepr") || getShipToCity().equals("Kharkov")) &&
                       (getShipFromCity().equals("Kiev") || getShipFromCity().equals("Odessa") || getShipFromCity().equals("Dnepr") || getShipFromCity().equals("Kharkov"));
    }

    boolean checkPrice (){
        return getBasePrice() >= 100;
    }

    boolean checkName(){
        return getCustomerOwned().getName() != null;
    }

    boolean checkGender (){
        return getCustomerOwned().getGender() == "Female";
    }

    double calculateDeliveryPrice (){
        double priceDelivery;
        if(getShipToCity() == "Kiev" || getShipToCity() == "Odessa"){
            priceDelivery = getBasePrice() * 0.15;
        }
        else
            priceDelivery = getBasePrice() * 0.1;

        return priceDelivery;
    }

}
