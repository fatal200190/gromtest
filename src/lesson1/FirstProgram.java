package lesson1;

import lesson9.Utils.Checker;

/**
 * Created by Олександр on 18.06.2017.
 */
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("My first Java program...");

        System.out.println("Done");
        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName("Google"));
    }
}
