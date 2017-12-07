package lesson27.HW;

import lesson20.task1.exeception.BadRequestException;

import java.util.LinkedList;

/**
 * Created by Alex on 10.08.2017.
 */
public class UserRepository {

    private LinkedList<User> users = new LinkedList<>();


    private User save(User user) throws Exception {
        if (user == null)
            throw new Exception("Can't save null user");
        users.add(user);
        return user;
    }


    public User update(User user) throws Exception{
        if (user == null)
            throw new Exception("Can't update null user");

        users.remove(user);
        users.add(user);
        return user;
    }

    public void delete (User user){
        users.remove(user);
    }


    public LinkedList<User> getUsers() {return users;}

}