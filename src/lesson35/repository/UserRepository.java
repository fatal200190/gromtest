package lesson35.repository;

import lesson35.model.User;

import java.util.ArrayList;

public class UserRepository {

    //считывание данных - считывание файла
    //обработка данных - маппинг данных
    ReadWriteToFile readWriteToFile = new ReadWriteToFile();


    public User registerUser(User user) throws Exception {
        readWriteToFile.writeFile("C:\\Users\\Alex\\Documents\\Project\\UserDb.txt",user);
        return user;
    }

    public ArrayList<User> read () throws Exception {
        return readWriteToFile.readFile("C:\\Users\\Alex\\Desktop\\test1.txt");
    }

}
