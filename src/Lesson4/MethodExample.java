package Lesson4;

/**
 * Created by Alex on 04.07.2017.
 */
public class MethodExample {
    public static void main(String[] args) {
        System.out.println( increaser(5, 20));
        System.out.println(min(increaser(10, 5), 11));

        //***increaser кейс
        //сумма двух интов +
        //сумма двух интов не всегда инт -
        //сумма отрицательных интов +

        System.out.println(increaser(9,1));
        System.out.println(increaser(1100000000,1100000000));
        System.out.println(increaser(-9,-1));

        //***min кейс
        //найти минимальное значение и верность логики +
        //если инты равные +
        //сравнение отрицательных значений +

        System.out.println(min(13,40));
        System.out.println(min(13,13));
        System.out.println(min(-13,-40));
    }


    public static int increaser (int a, int index) {
        System.out.println("method invoked");
        a += index;
        System.out.println("method before return");
        return a;
    }
    public static int min (int a, int b) {
        /*if (a < b)
            return a;
        else
            return b;*/
        return a < b ? a : b;
    }


}
