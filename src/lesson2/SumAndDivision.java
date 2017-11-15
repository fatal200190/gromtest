package lesson2;

/**
 * Created by Олександр on 18.06.2017.
 */
public class SumAndDivision {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            sum += i;
        }
        int n = sum / 1234;
        int m = sum % 1234;
        boolean res;
        System.out.println(m>n);
    }
}
