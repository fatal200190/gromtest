package lesson35.demo;

import lesson35.model.Hotel;
import lesson35.service.HotelService;

import java.util.Arrays;
import java.util.UUID;


public class HotelDemo {
    public static void main(String[] args) throws Exception {
        Hotel hotel = new Hotel("Tisa","Hun","Top","VVV");
        Hotel hotel1 = new Hotel("Tisa","Hun","Top","PPP");
        HotelService hotelService = new HotelService();
//
//        hotelService.addHotel(hotel1);
        hotelService.deleteHotel(0);


    }

}
