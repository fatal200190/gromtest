package Lesson11.HW;


import java.util.Arrays;
import java.util.Date;

/**
 * Created by Alex on 05.10.2017.
 */
public class Demo {
    public static void main(String[] args) {

    //нахождение комнаты +
    //отсутствие комнати в параметрах+
    //показать все+


    Room room0 = new Room(1101, 250, 3, new Date(), "Green", "Dnepr");
    Room room1 = new Room(1102, 350, 2, new Date(), "Blue", "Kiev");
    Room room2 = new Room(1103, 450, 1, new Date(), "White", "Odessa");
    Room room3 = new Room(1104, 150, 4, new Date(), "Black", "Lvov");
    Room room4 = new Room(1105, 500, 5, new Date(), "Pink", "Chop");
    Room[] rooms = new Room[]{room0, room1, room2, room3, room4};

   BookingComAPI bookingComAPI = new BookingComAPI(rooms);
    System.out.println(Arrays.deepToString(bookingComAPI.findRooms(250,3,"Dnepr", "Green")));
    System.out.println(Arrays.deepToString(bookingComAPI.findRooms(450,1,"Odessa", "White")));
    System.out.println(Arrays.deepToString(bookingComAPI.getAll()));

    TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
    System.out.println(Arrays.deepToString(tripAdvisorAPI.findRooms(350,3,"Kiev","Blue")));
    System.out.println(Arrays.deepToString(tripAdvisorAPI.findRooms(450,1,"Odessa","White")));
    System.out.println(Arrays.deepToString(tripAdvisorAPI.getAll()));

   GoogleAPI googleAPI = new GoogleAPI(rooms);
   System.out.println(Arrays.deepToString(googleAPI.findRooms(500,5,"Chop","Pink")));
    System.out.println(Arrays.deepToString(googleAPI.findRooms(450,1,"Odessa","White")));
   System.out.println(Arrays.deepToString(googleAPI.getAll()));

    API[]apis = new API[]{bookingComAPI,tripAdvisorAPI,googleAPI};
        bookingComAPI.findRooms(450,1,"Odessa", "White");
        tripAdvisorAPI.findRooms(450,1,"Odessa","White");
        googleAPI.findRooms(450,1,"Odessa","White");

    Controller controller = new Controller(apis);




    }

}
