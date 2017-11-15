package lesson2;

/**
 * Created by Олександр on 18.06.2017.
 */
public class LoopExample {
    public static void main(String[] args) {
        // for loop
        // while loop
        // for each loop (!)
        // do while loop

        //1. while loop
        int a = 1;

        while (a <= 10) {
            System.out.println(a);
            a++;
        }
        //2. do-while loop
        do{
            System.out.println(a);
            a++;
        } while (a <= 11);

    }
}
