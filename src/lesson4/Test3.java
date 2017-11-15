package lesson4;


/**
 * Created by Alex on 12.07.2017.
 */
public class Test3 {
    public static void main(String[] args) {

        System.out.println(compareSums(1,40,1,30));

        //***sum кейс
        //нахождение суммы+
        //проверка на отрицательные+
        //проверка a<=b +

        System.out.println(sum(1,5));
        System.out.println(sum(-1,5));
        System.out.println(sum(5,1));

        //***compareSums кейс
        //сравнение сумм+
        //проверка если равны+
        //проверка на long -

        System.out.println(compareSums(1,20,1,10));
        System.out.println(compareSums(1,40,1,40));
        System.out.println(compareSums(1000000000,1500000000,1,30));
    }

    public static long sum(int from, int to){
        int sum = 0;
        for (int i = from; i <= to; i++){
            sum += i;
        }
        return sum;
    }
    public static boolean compareSums(int a, int b, int c, int d){
        sum(a, b);
        sum(c,d);
        boolean compare = sum(a,b) > sum(c,d);
        return compare;
    }
}
