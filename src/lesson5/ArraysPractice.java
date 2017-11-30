package lesson5;

/**
 * Created by Alex on 13.07.2017.
 */
public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = {-10, 0, 110, 555, 1000, -45, 0, 60, 10};
        System.out.println(maxElement(array));
        System.out.println(nCount(array, 0));

        //***maxElement кейс
        //пустой масив -
        //отрицательные значения +
        //однаковые элементы +

//        int[] array1 = {};
//        Sys.out.println(maxElement(array1));

        int[] array2 = {-10, -110, -555, -1000, -45, -60, -10};
        System.out.println(maxElement(array2));


        int[] array3 = {2, 2, 2};
        System.out.println(maxElement(array3));

        //***nCount кейс
        //пустой масив -
        //ниодного совпадения +
        //количество совпадений +

//        int[] array4 = {};
//        Sys.out.println(nCount(array4,2));

        int[] array5 = {-10, -110, -555, -1000, -45, -60, -10};
        System.out.println(nCount(array5,100));

        System.out.println(nCount(array5,-10));


    }


    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;
        for (int el : array) {
            if (el == n)
                count++;
        }
        return count;
    }
}