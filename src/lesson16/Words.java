package lesson16;

import java.util.Arrays;

/**
 * Created by Alex on 01.11.2017.
 */
public class Words {
    public static int countWords(String input) {
        if (input == null || input.isEmpty())
            return 0;

        input = input.trim();
        String [] words = input.split(" ");
        int count = 0;

        for (String word : words){
            if(!word.isEmpty() && checker(word))
                count++;
        }
        return count;
    }


    public static String maxWord (String input){
        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String maxWord = null;

        for (String word : words){
            if(word.length() > 0 && checker(word)){
                maxWord = word;
                break;
            }
        }

        if (maxWord == null)
            return null;

        for (String word : words){
            if(word.length() > maxWord.length() && checker(word)){
                maxWord = word;
            }
        }
        return maxWord;
    }

    public static String minWord (String input){
        String[] words = input.split(" ");

        if (words.length == 0)
            return null;

        String minWord = null;

        for (String word : words){
            if(word.length() > 0 && checker(word)){
                minWord = word;
                break;
            }
        }

        if (minWord == null)
            return null;

        for (String word : words){
            if(word.length() < minWord.length() && word.length() > 0 && checker(word)){
                minWord = word;
            }
        }
        return minWord;
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
        int count = 0;
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
                count = 0;
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
