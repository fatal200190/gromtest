package Lesson6;


import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

/**
 * Created by Alex on 25.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car (10000, 2015, "Anton");
        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);
        System.out.println(carObject.ownerName);

        carObject.horsePower = 100;
        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.stopRun();

        carObject.changeOwner("Test");
        System.out.println(carObject.ownerName);

        Car carObject2 = null;
        System.out.println(carObject2);

        Order order = new Order(500,new Date(),true,new Date(),"Dnepr","Ukraine","Buy");
        System.out.println(order.checkPrice());
        System.out.println(order.isValidType());



    }
}
