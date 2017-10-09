package Lesson11.firstinterface;

/**
 * Created by Alex on 30.08.2017.
 */
public class TestClass implements FirstInterface {

    private int test = 10;

    @Override
    public void send() {
    //some logic
    }

    @Override
    public String receive() {
        //some logic
        return null;
    }
}
