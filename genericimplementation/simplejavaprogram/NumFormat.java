package genericimplementation.simplejavaprogram;

import java.text.NumberFormat;

public class NumFormat {
    /**
     * Author: Usman Muhammad
     * Purpose: Siwes report
     * Course of study: Bsc Computer science
     * Program Description: Demonstration of the NumberFormat class in Java program
     */

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("********************************************************");
        System.out.println("Please i'm using this figures for demonstration purpose");
        System.out.println("********************************************************\n");
;
        System.out.println("Average salary of software engineers\n in country ranges between "
                + currency.format(45000) + " to " + currency.format(121856));
        System.out.println("With " + percent.format(0.06) + " growth");
    }
}
