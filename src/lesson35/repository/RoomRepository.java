package lesson35.repository;

import lesson35.model.Room;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class RoomRepository extends Repository {
    @Override
    public void writeToFile(File file, Object object) throws Exception {
        super.writeToFile(file, object);
    }

    @Override
    public ArrayList readObjectsFromFile(File file) throws Exception {
        return super.readObjectsFromFile(file);
    }

    @Override
    public Object lineToObjectFormat(String[] fields) {
        Room room = new Room();
        room.setId(Long.parseLong(fields[0]));
        room.setNumberOfGuests(Integer.parseInt(fields[1]));
        room.setPrice(Double.parseDouble(fields[2]));
        room.setBreakfastIncluded(Boolean.getBoolean(fields[3]));
        room.setPetsAllowed(Boolean.getBoolean(fields[4]));
        room.getDateAvailableFrom();
        return super.lineToObjectFormat(fields);
    }
}
