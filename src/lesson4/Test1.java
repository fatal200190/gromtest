package lesson4;

/**
 * Created by Alex on 04.07.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(concat("Wherer is " , "my car, ", "Duuuude???"));
    }
    public static String concat(String firstWord, String secondWord, String thirdWord) {
        String result = firstWord + secondWord + thirdWord;
        return result;
    }
}
