package lesson4;

/**
 * Created by Alex on 04.07.2017.
 */
public class Test2 {
    public static void main(String[] args) {

        System.out.println(findDivCount((short)1, (short)30, 8));


        //***findDivCount кейс
        //нахождение кратных+
        //проверка на ноль-
        //проверка a<=b +

        System.out.println(findDivCount((short)1, (short)40, 8));
        System.out.println(findDivCount((short)1, (short)30, 0));
        System.out.println(findDivCount((short)40, (short)1, 8));
    }
    public static int findDivCount(short a, short b, int n){
        int count = 0;
        for(int i = a; i <= b; i++){
            if (i % n == 0)
                count ++;

        }
        return count;
    }

}

