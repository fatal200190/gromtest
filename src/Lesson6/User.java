package Lesson6;


import java.util.Date;

/**
 * Created by Alex on 24.07.2017.
 */
public class User {
    String name;
    int age;
    String city;
    Date lastActiveDate;
    boolean isActive;

    public User() {
    }

    public User(String name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }

    void logIn(){
       Date lastActiveDate = new Date();
    }
    void isActive(boolean status){
        isActive = status;
    }
    void increaseAge(){
        age++;
    }
}
