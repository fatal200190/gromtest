package lesson35.service;

import lesson35.model.User;
import lesson35.model.UserStatus;
import lesson35.model.UserType;
import lesson35.repository.UserRepository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserService extends UserRepository{

    File userDb = new File("C:\\Users\\Alex\\Documents\\Project\\UserDb.txt");

    public User registerUser(User user) throws Exception {
        if (user.getUserName().equals(null) || user.getPassword().equals(null) ||
                user.getCountry().equals(null) || user.getUserType().equals(null)){
            throw new Exception("Some field is not filled");
        }
        ArrayList<User>users = readObjectsFromFile(userDb);
        for (User us : users){
            if (us.getUserName().equals(user.getUserName()) || us.getId() == user.getId()){
                throw new Exception("User already exist.");
            }
        }
        writeToFile(userDb,user);
        return user;
    }
    public void login(String userName, String password) throws Exception {
        ArrayList<User>users = readObjectsFromFile(userDb);
        for (User user : users){
            if (user.getUserStatus().equals(UserStatus.ONLINE)){
                throw new Exception("Some user is already online");
            }
        }

        int index = 0;
        for (User user : users){
            if (user!=null && user.getUserName().equals(userName) &&
                    user.getPassword().equals(password)){
                users.get(index).setUserStatus(UserStatus.ONLINE);
                reWriteDb(users,userDb);
                return;
            }
           index++;
        }
        throw new Exception("Wrong User Name or Password");

    }
    public void logout() throws Exception {
        ArrayList<User>users = readObjectsFromFile(userDb);
        int index = 0;
        for (User user : users){
            if (user.getUserStatus().equals(UserStatus.ONLINE)){
                users.get(index).setUserStatus(UserStatus.OFFLINE);
                reWriteDb(users,userDb);
                return;
            }
            index++;
        }
    }
    private void reWriteDb (ArrayList<User>users, File file) throws Exception {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false))) {
            bufferedWriter.append("");
        } catch (IOException e) {
            throw new IOException("Can't write to file");
        }
        for (User us : users){
            writeToFile(file, us);
        }
    }

    public UserType getOnlineUserType () throws Exception {
        ArrayList<User>users = readObjectsFromFile(userDb);
        for (User user : users){
            if (user.getUserStatus().equals(UserStatus.ONLINE)){
                return user.getUserType();
            }
        }
        throw new Exception("You need to register on or login");
    }

}
