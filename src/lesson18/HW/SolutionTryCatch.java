package lesson18.HW;

import java.util.Arrays;

/**
 * Created by Alex on 02.11.2017.
 */
public class SolutionTryCatch {
    public static void main(String[] args) {
        String test = "1 hg 2 kgg 2* fdggdf    r3 =- edf  12254  -2";
        System.out.println(Arrays.toString(findNumbers(test)));
    }
    public static int[] findNumbers(String text) {
        if (text.isEmpty() || text == null){
            return null;
        }

        String [] words = text.split(" ");


        if (text.isEmpty()) {
            return null;
        }

        int count = 0;
        for (String word : words) {
            if (word.length() > 0 && checker(word))
                count++;
        }

        int[] numbers = new int[count];
        if (numbers.length == 0) {
            return null;
        }

        int count1 = 0;

        for (String word : words) {
            if (word.length() > 0) {
                try {
                    numbers[count1] = Integer.parseInt(word);
                    count1++;
                }catch (Exception e){
                    System.out.println("not a number");
                }
            }
        }
        return numbers;


    }

    private static boolean checker (String inputWord){
        char[] chars = inputWord.toCharArray();
        for (char ch : chars){
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
}
