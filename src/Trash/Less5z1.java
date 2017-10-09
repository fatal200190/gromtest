package Trash;

/**
 * Created by Alex on 20.07.2017.
 */
public class Less5z1 {
    public static void main(String[] args) {
        int[]array = {5,4,3,8,16,-100};
        sortAscending(array);
        printArray(array);
        sortDescending(array);
        printArray(array);

    }
    private static void checkItemsWithMinimum(int minimum,int minIndex,int index,int[] array){
        for(int i=index;i<array.length;i++){
            if (minimum > array[i]){
                array[minIndex]=array[i];
                array[i]=minimum;
                minimum=array[minIndex];

            }
        }
    }
    static void sortAscending(int[] array){
        for (int i=0;i<(array.length-1);i++){
            int minimumItem = array[i];
            checkItemsWithMinimum(minimumItem,i,i+1,array);

        }
    }
    private static void checkItemsWithMaximum(int max,int maxIndex,int index,int[] array){
        for(int i=index;i<array.length;i++){
            if (max < array[i]){
                array[maxIndex]=array[i];
                array[i]=max;
                max=array[maxIndex];

            }
        }
    }
    static void sortDescending(int[] array){
        for (int i=0;i<(array.length-1);i++){
            int maxItem = array[i];
            checkItemsWithMaximum(maxItem,i,i+1,array);

        }
    }
    static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

