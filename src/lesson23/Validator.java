package lesson23;

/**
 * Created by Alex on 29.11.2017.
 */
public final class Validator {
    private String name;
    private final static int checkCount = 7;

    public Validator(String name) {
        this.name = name;
    }

    public final boolean validate(){
        //
        //logic
        //
        return false;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }
}
