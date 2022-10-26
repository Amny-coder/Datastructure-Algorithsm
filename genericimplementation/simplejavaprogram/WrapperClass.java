package genericimplementation.simplejavaprogram;

import java.util.Scanner;

public class WrapperClass {
    /**
     * Author: Usman Muhammad
     * Purpose: Siwes report
     * Course of study: Bsc Computer science
     * Program Description: Demonstration of the Java wrapper class.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month, year;

        System.out.println("""
                Let me tell you your age just feed me
                with the year that you are born, ok
                lets start!
                """);
        System.out.print("Feed me with the current month ==-> ");
        month = scan.next();

        System.out.print("Feed me with the year ==-> ");
        year = scan.next();

        int birthYear = Integer.parseInt(year);
        int birthMonth = Integer.parseInt(month);

        if (birthMonth > 12 && birthYear > 2022) {
            System.out.println("Hhhh hhh you lie to me you think computers are not smart\nbut humans are smarter!.");
        }
        else {
            int ageMonth = 12 - birthMonth;
            int age = 2022 - birthYear;
            System.out.println("Your are : " + age + "years old " + ageMonth + "month");

            double ageCal = (age / 2) + 5;
            Double negAge = ageCal;

            System.out.println("Let me divide your age by 2 and add 5years " + negAge);
        }
    }
}
