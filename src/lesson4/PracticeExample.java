package lesson4;

/**
 * Created by Alex on 04.07.2017.
 */
public class PracticeExample {
    public static void main(String[] args) {
        System.out.println(min(2,5,10));
        System.out.println(min(10,5,2));
        System.out.println(min(10,5,10));

        System.out.println(average(2));
        System.out.println(average(10));

        System.out.println(average(2,5));

        System.out.println(count(1,100,5));

        //***min кейс
        //найти минимальное значение и верность логики +
        //если инты равные +
        //сравнение отрицательных значений +

        System.out.println(min(2,5,10));
        System.out.println(min(2,2,10));
        System.out.println(min(-2,-5,-10));

        //***average кейс
        //найти среднее на промежутке от 1 до n +
        //сумма на промежутке больше инта -
        //отрицательные значения -

        System.out.println(average(5));
        System.out.println(average(1000000000));
        System.out.println(average(-5));

        //***average кейс
        //найти среднее на промежутке от a до b +
        //сумма на промежутке больше инта -
        //отрицательные значения +
        System.out.println(average(1,3));
        System.out.println(average(1000000000,1100000000));
        System.out.println(average(-5,-2));

        //***count
        // кейс
        //найти количество n от a до b +
        //ноль +
        //отрицательные значения -
        System.out.println(count(1,100,5));
        System.out.println(count(20,20,5));
        System.out.println(count(-25,-20,5));
    }
    public static int min (int a, int b, int c){
        int res = a < b ? a : b;
        return res < c ? res : c;
    }
    public static double average (int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return (double) sum / n;
    }
    public static double average (int a, int b){
        //2 - 5 : {2,3,4,5} = b - a + 1
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return (double) sum / (b - a + 1);
    }

    public static int count(int a, int b, int n){

        int  count = 0;
        for (int i = a; i <= b; i++){
            if (i % 10 == n)
                count ++;
        }
        return count;
    }
}
