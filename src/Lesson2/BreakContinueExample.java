package Lesson2;

/**
 * Created by Олександр on 18.06.2017.
 */
public class BreakContinueExample {
    public static void main(String[] args) {
        int test = 10;

        // break example
        /*while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
            break;
        }*/

        // continue example
        while (test > 0) {
            System.out.println(test);
            System.out.println("...");
            test--;
            continue;
        }
        System.out.println("Done");
    }
}
