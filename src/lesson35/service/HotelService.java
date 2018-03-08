package lesson35.service;

import lesson35.model.Hotel;
import lesson35.model.UserType;
import lesson35.repository.HotelRepository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HotelService extends HotelRepository {
    private File hotelDb = new File("C:\\Users\\Alex\\Documents\\Project\\HotelDb.txt");

    public ArrayList findHoteByName(String name) throws Exception {
        ArrayList<Hotel> hotels = readObjectsFromFile(hotelDb);
        ArrayList<Hotel> result = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(name)) {
                result.add(hotel);
            }
        }
        if (result.size() == 0) {
            throw new Exception("There is no hotel with name: " + name);
        }
        return result;
    }

    public ArrayList findHoteByCity(String city) throws Exception {
        ArrayList<Hotel> hotels = readObjectsFromFile(hotelDb);
        ArrayList<Hotel> result = new ArrayList<>();

        for (Hotel hotel : hotels) {
            if (hotel.getCity().equals(city)) {
                result.add(hotel);
            }
        }
        if (result.size() == 0) {
            throw new Exception("There is no hotel in the city of: " + city);
        }
        return result;
    }

    public Hotel addHotel(Hotel hotel) throws Exception {
        UserService userService = new UserService();
        if (userService.getOnlineUserType().equals(UserType.ADMIN)) {

            if (hotel == null) {
                throw new Exception("Hotel can not be null");
            }
            if (hotel.getName() == null || hotel.getCountry() == null || hotel.getCity() == null || hotel.getStreet() == null) {
                throw new Exception("Some field is not filled");
            }

            ArrayList<Hotel> hotels = readObjectsFromFile(hotelDb);

            for (Hotel hot : hotels) {
                if (hot.getId() == hotel.getId()){
                    throw new Exception("Hotel with id "+ hotel.getId()+" already exist");
                }
                if (hot.getName().equals(hotel.getName()) && hot.getCountry().equals(hotel.getCountry()) &&
                        hot.getCity().equals(hotel.getCity()) && hot.getStreet().equals(hotel.getStreet())) {
                    throw new Exception("Hotel is already exist");
                }
            }
            writeToFile(hotelDb, hotel);
            return hotel;
        }
        throw new Exception("You need to be Admin to add Hotel");
    }

    public void deleteHotel(long hotelId) throws Exception {
        ArrayList<Hotel> hotels = readObjectsFromFile(hotelDb);

        int res = 0;
        for (Hotel hotel : hotels) {
            if (hotel.getId() == hotelId) {
                res++;
            }
        }
        if (hotels.isEmpty() || res == 0) {
            throw new Exception("There is no hotel with " + hotelId + " ID");
        }

        int index = 0;
        for (Hotel hotel : hotels) {
            if (hotel.getId() == hotelId) {
                break;
            }
            index++;
        }
        hotels.remove(index);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(hotelDb, false))) {
            bufferedWriter.append("");
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
        for (Hotel hotel : hotels){
            writeToFile(hotelDb, hotel);
        }

    }

}

