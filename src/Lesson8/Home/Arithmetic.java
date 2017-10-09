package Lesson8.Home;

/**
 * Created by Alex on 02.08.2017.
 */
public class Arithmetic {
   public boolean check(int[] array){
       int max = array[0];
       int min = array[0];
       for(int i = 0; i < array.length; i ++){
           if(array[i] > max){
               max = array[i];
           }
           if(array[i] < min){
               min = array[i];
           }
       }
       if ((min + max) > 100) {
           return true;
       }
       else
        return false;
    }

    public Arithmetic() {
    }
}
