package lesson11.interfaceexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class MySQLProvider implements DbProvider {

    @Override
    public void connectToDb() {
    //some logic for MySQL
    }

    @Override
    public void disconnectFromDb() {
    //some logic for MySQL
    }

    @Override
    public void encryptData() {
        //some logic for MySQL
    }
}
