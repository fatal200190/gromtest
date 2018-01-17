package lesson32.HW;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public void readNumbers() throws IOException {

        int n = 3;

        int sum = 0;


        while (n > 0) {

            Scanner scan = new Scanner(System.in);

            String str = scan.nextLine();

            String[] numbers = str.split(" ");

            if (!validate(numbers)) {
                n--;
                errorCounter(n);
            } else {
                for (String s : numbers) {
                    sum += Integer.parseInt(s);
                }
                System.out.println("Sum of numbers is " + sum);
            }
        }
    }

    private boolean validate (String[] numbers){
        if (numbers.length != 10){
            return false;
        }
        else
        try{
            for (String s : numbers) {
                if (Integer.parseInt(s) > 100){
                    return false;
                }
            }
        } catch(Exception e) {
            return false;
        }

        return true;
    }

    private void errorCounter(int n){
        if (n==0){System.out.println("Your numbers are wrong. Number of attempts exceeded");}
        else {System.out.println("Your numbers are wrong. You have " + n +" attempts to try again");
        }
    }
}
