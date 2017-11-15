package lesson10.abstractfirstexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class PostgreSQLDbProvider extends DbProvider{

    @Override
    void connectToDb(){
        //logic for Postgres
    }
    @Override
    void disconnectFromDb(){
        //logic  for Postgres
    }
}