package lesson5;

/**
 * Created by Alex on 20.07.2017.
 */
public class UniqueHome {
    public static void main(String[] args) {
        int [] array = {};
        int [] arr1 = {1,3,3,8,-100,3,22};
        int [] arr2 = {1};
        System.out.println(uniqueCount(array));
        System.out.println(uniqueCount(arr1));

        //***uniqueCount кейс
        //нахождение уникальных +
        //однин элемент +
        //пустой масив +
        System.out.println(uniqueCount(arr1));
        System.out.println(uniqueCount(arr2));
        System.out.println(uniqueCount(array));


    }

    public static int uniqueCount(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int count = 1;
        boolean flag;
        for (int i = 1; i < array.length; i++) {
            flag = true;
            for (int j=i-1; j >= 0; j--) {
                if (array[j] == array[i]) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

}
