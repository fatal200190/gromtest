package lesson16;

import java.util.Arrays;

/**
 * Created by Alex on 17.10.2017.
 */
public class StringMethods {
    public static void main(String[] args) {
        String test = "someStringExample";

        System.out.println(test.isEmpty());

        System.out.println("".isEmpty());

        System.out.println(test.length());

        System.out.println(test.charAt(2));

        String res = test.replace("me","T");
        System.out.println(res);

        System.out.println(test.replaceAll("me","T"));

        //String regex = "{a-Z}";
        System.out.println(test);
        System.out.println(test.contains("me"));

        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split(" ")));

        System.out.println(" test a".trim());

        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5,10).trim());

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        System.out.println(Arrays.toString(test.getBytes()));
        test.equals("eeeeee");
        test.intern();

    }
}
