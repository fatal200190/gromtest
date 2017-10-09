package Lesson10.abstractfirstexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class MySQLProvider extends DbProvider{


    @Override
    void connectToDb(){
        //logic for MySQL
    }

    @Override
    void disconnectFromDb() {

    }
}
