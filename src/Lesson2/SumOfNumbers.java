package Lesson2;

/**
 * Created by Олександр on 18.06.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1; i <= 10000000; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
