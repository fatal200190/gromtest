package Lesson11.HW;

/**
 * Created by Alex on 30.08.2017.
 */
public class Controller {
    API[]apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[]requestRooms(int price, int persons, String city, String hotel) {

        int count = 0;
        for (API api : apis) {
            if(api != null){
                if(api.findRooms(price,persons,city,hotel).equals(api))
                    count ++;
            }
        }
        Room[] result = new Room[count];
        int count2 = 0;
        for (API api : apis) {
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result[count2] = room;
                count2++;
            }
        }
        return result;
    }

    Room[]check (API api1, API api2) {
        Room[] rooms1 = api1.getAll();
        Room[] rooms2 = api2.getAll();

        int count = 0;
        for (Room room1 : api1.getAll()){
            for (Room room2 : api2.getAll()){
                if (room1 != null && room2 != null && room1.getPrice() == room2.getPrice() &&
                        room1.getPersons()== room2.getPersons() && room1.getHotelName()==room2.getHotelName()&& room1.getCityName() == room2.getCityName())
                    count++;
            }
        }
        Room [] result = new Room[count];

        int count2 = 0;
        for (Room room1 : api1.getAll()){
            for (Room room2 : api2.getAll()){
                if (room1 != null && room2 != null && room1.getPrice() == room2.getPrice() &&
                        room1.getPersons()== room2.getPersons() && room1.getHotelName()==room2.getHotelName()&& room1.getCityName() == room2.getCityName())
                    result[count2] = room1;
                count2++;
            }
        }
        return result;
    }

}
