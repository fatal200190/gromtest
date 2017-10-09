package Lesson11.HW;

/**
 * Created by Alex on 30.08.2017.
 */
public class TripAdvisorAPI implements API {

    Room [] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms){
            if(room.getPersons() <= persons + 1 && room.getPersons() >= persons -1 && room.getCityName() == city &&
                    room.getHotelName() == hotel && room.getPrice() == price) {
                count++;
            }
        }
        Room [] results = new Room[count];
        int index = 0;
        int resIndex = 0;
        for (Room room : rooms) {
            if (room != null && room.getPersons() <= persons + 1 && room.getPersons() >= persons -1 && room.getCityName() == city &&
                    room.getHotelName() == hotel && room.getPrice() == price) {
                results[resIndex] = rooms[index];
                resIndex++;
            }
            index++;
        }
        return results;

    }

    @Override
    public Room[] getAll() {
        return rooms;
    }


}
