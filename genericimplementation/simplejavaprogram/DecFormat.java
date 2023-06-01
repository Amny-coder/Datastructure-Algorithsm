package genericimplementation.simplejavaprogram;

import java.util.Scanner;

public class DecFormat {
    /**
     * Author: Usman Muhammad
     * Purpose: Siwes report
     * Course of study: Bsc Computer science
     * Program Description: Demonstration of the DecimalFormat class by solving
     * quadratic equation using general formula X = -b +or- sqrt(b^2 - 4ac)/2a.
     */

    public static void main(String[] args) {
        System.out.println("\tQuadratic equation");
        System.out.println("[+++++++++++++++++++++]");

        Scanner scan = new Scanner(System.in);

        double a, b, c;
        System.out.print("Value of A to Form the equation -> ");
        a = scan.nextInt();

        System.out.print("Value of B to Form the equation -> ");
        b = scan.nextInt();

        System.out.print("Value of C to Form the equation -> ");
        c = scan.nextInt();

        System.out.println(a + "X^2 " + b + "X " + c + " = 0");

        if (a != 0) {
            double mul = 4 * a * c;
            double power = (Math.pow(b, 2) - (mul));

            double positiveResult = ((b + Math.sqrt(power)) / 2 * a);
            double negativeResult = ((b - Math.sqrt(power)) / 2 * a);

            System.out.println("X1 = " + positiveResult + " , " + "X2 = " + negativeResult);
        }


    }
}
