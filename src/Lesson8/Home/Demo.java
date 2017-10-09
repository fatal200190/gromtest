package Lesson8.Home;

/**
 * Created by Alex on 02.08.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] array1 = {100,50,60,90,100,-20};
        adder.add(2,4);
        adder.check(array1);
    }
}
