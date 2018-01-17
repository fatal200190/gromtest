package lesson31.HW;

import java.util.*;

public class Solution{

    public Map countSymbols(String text) throws Exception {
        if (text == null){
            throw new Exception("Text is null");
        }
            text = text.toLowerCase();
            Map<Character, Integer> map = new TreeMap<>();
            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    int count = map.get(ch) != null ? map.get(ch) : 0;
                    count++;
                    map.put(ch, count);
                }
            }
            return map;
    }
    public Map words(String text) throws Exception {
        if (text == null){
            throw new Exception("Text is null");
        }
        text = text.toLowerCase();
        Map<String, Integer> map = new TreeMap<>();
        for (String word : text.split(" ")) {
            if (wordSymbolCheck(word) && word.length() > 2) {
                int count = map.get(word) != null ? map.get(word) : 0;
                count++;
                map.put(word, count);
            }
        }
        return map;
    }

    private boolean wordSymbolCheck (String word){
        for (char ch : word.toCharArray()){
            if (!Character.isLetter(ch))
                return false;
        }
        return true;
    }

    }

