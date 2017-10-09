package Lesson10.HW;

import java.util.Date;

/**
 * Created by Alex on 22.08.2017.
 */
public class Demo {
    public static void main(String[] args) {

     //проверка города +
     //проверка пола+
     //проверка стоимости доставки+

        Customer customer = new Customer("Ivan","Kiev","Female");
       ElectronicsOrder electronicsOrder = new ElectronicsOrder("Lobz", new Date(), "Dnepr", "Kiev", 1200, customer,30 );
        electronicsOrder.calculatePrice();
        electronicsOrder.validateOrder();
        System.out.println(electronicsOrder.getTotalPrice());

        Customer customer1 = new Customer("Paul","Lvov","Male");
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Toster", new Date(),"Kharkov","Kiev",90,customer1,12);
        electronicsOrder1.calculatePrice();
        electronicsOrder1.validateOrder();
        System.out.println(electronicsOrder1.getTotalPrice());

        Customer customer2 = new Customer("Peter","Odessa","Male");
        FurnitureOrder furnitureOrder = new FurnitureOrder("Pipe",new Date(),"Lvov","Kiev",1200, customer2, "PVC");
        furnitureOrder.calculatePrice();
        furnitureOrder.validateOrder();
        System.out.println(furnitureOrder.getTotalPrice());

        Customer customer3 = new Customer("Misha","Dnepr","Male");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Bag",new Date(),"Dnepr","Kiev",6000, customer3, "PE");
        furnitureOrder1.calculatePrice();
        furnitureOrder1.validateOrder();
        System.out.println(furnitureOrder1.getTotalPrice());
    }
}
