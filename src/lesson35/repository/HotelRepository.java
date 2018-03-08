package lesson35.repository;


import lesson35.model.Hotel;

import java.io.File;
import java.util.ArrayList;

public class HotelRepository extends Repository {
    @Override
    public void writeToFile(File file, Object object) throws Exception {
        super.writeToFile(file, object);
    }

    @Override
    public ArrayList readObjectsFromFile(File file) throws Exception {
        return super.readObjectsFromFile(file);
    }

    @Override
    public Hotel lineToObjectFormat(String[] fields) {
        Hotel hotel = new Hotel();
        hotel.setId(Long.parseLong(fields[0]));
        hotel.setName(fields[1]);
        hotel.setCountry(fields[2]);
        hotel.setCity(fields[3]);
        hotel.setStreet(fields[4]);
        return hotel;
    }
}
