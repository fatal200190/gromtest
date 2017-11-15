package lesson11.interfaceexample;

/**
 * Created by Alex on 21.08.2017.
 */
public class OracleDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for Oracle
    }

    @Override
    public void disconnectFromDb() {
        //some logic for Oracle
    }

    @Override
    public void encryptData() {
        //some logic for Oracle
    }


}
