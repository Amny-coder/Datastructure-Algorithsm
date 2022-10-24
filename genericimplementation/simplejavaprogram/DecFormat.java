package genericimplementation.simplejavaprogram;

import java.text.DecimalFormat;
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

        int a, b, c;
        System.out.print("Form the equation -> ");
        a = scan.nextInt();

        System.out.print("Form the equation -> ");
        b = scan.nextInt();

        System.out.print("Form the equation -> ");
        c = scan.nextInt();

        System.out.println(a + "X^2 " + b + "X " + c + " = 0");

        DecimalFormat fmt = new DecimalFormat("0.##");

        double root = Math.pow(b, 2) - 4 * a * c;
        double result;

        result = ((-b + Math.sqrt(root) / 2 * a ));
        System.out.println("Positive first: " + fmt.format(result));

        result = ((-b - Math.sqrt(root)) / 2 * a );
        System.out.println(":: " + fmt.format(result));

    }
}
