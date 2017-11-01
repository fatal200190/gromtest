package Lesson16;

import java.util.Arrays;

/**
 * Created by Alex on 20.10.2017.
 */
public class Solution {
    public static void main(String[] args) {
        String test = "";
        String test1 = "     ";
        String test2 = "))av ))av 3 21 18 ";
        String test3 = "        ))av ))av 3 21 18       . . . .  ";
        String test4 = "abc cde fda d";
        String test5 = "))av ))av abc abc bca bca 3 21 18 ";
        System.out.println(mostCountedWord(test));
        System.out.println(mostCountedWord(test1));
        System.out.println(mostCountedWord(test2));
        System.out.println(mostCountedWord(test3));
        System.out.println(mostCountedWord(test4));
        System.out.println(mostCountedWord(test5));
    }


    public static String mostCountedWord(String input){
        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String countedWord = null;

        for (String word : words){
            if(word.length() > 0 && checker(word)){
                countedWord = word;
                break;
            }
        }

        if (countedWord == null)
            return null;


        Arrays.sort(words);
        String maxCountedWord = null;
        String word = null;
        int maxCount = 0;
        int count = 1;
        for (String w : words){
            if (w.equals(word) && checker(w) && w.length() > 0){
                count ++;
            }
            else {
                if (count > maxCount){
                    maxCount = count;
                    maxCountedWord = word;
                }
                word = w;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxCountedWord = word;
        }

        return maxCountedWord;
    }


    private static boolean checker (String inputWord){
        for (int i=0; i < inputWord.length(); i++){
            if(!Character.isLetter(inputWord.charAt(i)))
                return false;
        }
        return true;
    }

}
