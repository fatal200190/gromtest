package Lesson7;

import Lesson6.Car;
import Lesson6.DbConnector;
import Lesson6.User;


/**
 * Created by Alex on 25.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        //two options to create objects
        //class name (type) object name = new class name ()
        //class name (type) object name = new class name (attributes)

        User user = new User();
        User user1 = new User();
        User user2 = new User();

        User user3 = new User("Jack");

        Car car = new Car(10000, 2015, "Anton");
        //Car car1 = new Car();

        DbConnector dbConnector = new DbConnector();

    }
}
