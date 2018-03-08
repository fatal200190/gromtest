package lesson35.repository;

import lesson35.model.User;
import lesson35.model.UserStatus;
import lesson35.model.UserType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class UserRepository extends Repository{

    //считывание данных - считывание файла
    //обработка данных - маппинг данных

    @Override
    public void writeToFile(File file, Object object) throws Exception {
        super.writeToFile(file, object);
    }

    @Override
    public ArrayList readObjectsFromFile(File file) throws Exception {
        return super.readObjectsFromFile(file);
    }

    @Override
    public User lineToObjectFormat(String[] fields) {
        User user = new User();
        user.setId(Long.parseLong(fields[0]));
        user.setUserName(fields[1]);
        user.setPassword(fields[2]);
        user.setCountry(fields[3]);

        if (fields[4].equals("USER")){
            user.setUserType(UserType.USER);
        }else user.setUserType(UserType.ADMIN);
        if (fields[5].equals("ONLINE")) {
            user.setUserStatus(UserStatus.ONLINE);
        }else user.setUserStatus(UserStatus.OFFLINE);
        return user;
    }
}
