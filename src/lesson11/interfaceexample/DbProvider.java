package lesson11.interfaceexample;

/**
 * Created by Alex on 21.08.2017.
 */
public interface DbProvider {

    void connectToDb();

    void disconnectFromDb();

    void encryptData();

}
