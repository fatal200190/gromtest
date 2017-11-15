package lesson16;


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
        if (input.isEmpty()){
            return null;
        }

        String [] words = input.split(" ");

        int maxCount = 0;
        String mostFrequent = null;
        for (String word : words){
            int count = 0;
            for (String item : words){
                if (word.equals(item) && word.length() > 0 && checker(word))
                    count++;}

                if (count > maxCount){
                    maxCount = count;
                    mostFrequent = word;
                }
            }
            return mostFrequent;
    }


    private static boolean checker (String inputWord){
        for (int i=0; i < inputWord.length(); i++){
            if(!Character.isLetter(inputWord.charAt(i)))
                return false;
        }
        return true;
    }

}
