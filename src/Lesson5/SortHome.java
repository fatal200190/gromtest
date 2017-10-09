package Lesson5;

import java.util.Arrays;

/**
 * Created by Alex on 17.07.2017.
 */
public class SortHome {
    public static void main(String[] args) {
        int [] arr = {1,3,5,8,-100,14,22};
        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr)));

        //***sortAscending кейс
        //сортировка возростание +
        //однинаковые значения +
        //пустой масив +

        System.out.println(Arrays.toString(sortAscending(arr)));

        int [] arr1 = {1,3,3,8,-100,14,22};
        System.out.println(Arrays.toString(sortAscending(arr1)));

        int [] arr2 = {};
        System.out.println(Arrays.toString(sortAscending(arr2)));

        //***sortDescending кейс
        //сортировка возростание +
        //однинаковые значения +
        //пустой масив +

        System.out.println(Arrays.toString(sortDescending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr1)));
        System.out.println(Arrays.toString(sortDescending(arr2)));


    }
    public static int[] sortAscending (int [] arr){
        int n = arr.length;
        int temp;
        for (int i=0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr [j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] sortDescending (int [] arr){
        int n = arr.length;
        int temp;
        for (int i=0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr [j] = temp;
                }
            }
        }
        return arr;
    }

}