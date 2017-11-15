package lesson7;

import lesson6.Order;

import java.util.Date;

/**
 * Created by Alex on 25.07.2017.
 */
public class DemoHomeWork {
    public static void main(String[] args) {
    Order newOdrer = new Order(100, new Date(), false, null, "Dnepr",  "Ukraine", "Buy");
    newOdrer.checkPrice();
    newOdrer.confirmOrder();
    newOdrer.isValidType();

    }
    public static Order createOrder() {
        return new Order(100, new Date(), false, null, "Dnepr",  "Ukraine", "Buy");
    }
    public static Order createOrderAndCallMethods(){
        Order order = new Order(100, new Date(), true, new Date(), "Kiev",  "Ukraine", "SomeValue");

    return order;
    }

}
