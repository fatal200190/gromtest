package Lesson11.HW;

/**
 * Created by Alex on 30.08.2017.
 */
public interface API {

    Room [] findRooms (int price, int persons, String city, String hotel);
    Room [] getAll();


}
