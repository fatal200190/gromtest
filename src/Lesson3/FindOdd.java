package Lesson3;

/**
 * Created by Alex on 21.06.2017.
 */
public class FindOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 1; a <= 1000; a += 2) {
            sum += a;
            System.out.println(" Found " + a);
        }
        long b = sum * 5;
        if(b > 5000) {
            System.out.println("Bigger");
        }
        else {
            System.out.println("Smaller or equal");
        }
    }
}
