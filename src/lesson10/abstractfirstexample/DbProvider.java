package lesson10.abstractfirstexample;

/**
 * Created by Alex on 21.08.2017.
 */
public abstract class DbProvider {

    //public DbProvider(String dbHost) {
    //  this.dbHost = dbHost;
    //}

    private String dbHost;

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDbHost(){
        System.out.println("DB  host is " + dbHost);
    }
}
