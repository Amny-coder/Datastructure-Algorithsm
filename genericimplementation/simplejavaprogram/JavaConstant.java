package genericimplementation.simplejavaprogram;

public class JavaConstant {
    /**
     * Author: Usman Muhammad
     * Purpose: Siwes report
     * Course of study: Bsc Computer science
     * Program Description: Declaring Constant in Java program
     */
    public static void main(String[] args) {
        final int MAX = 5;

        System.out.println("I'm constant number: " + MAX + " and i will execute not more than "
                + MAX + " times\nhere we go!");
        int i = 1;
        while (i <= MAX) {
            System.out.println("I'm number: " + i);
            i++;
        }
    }
}
