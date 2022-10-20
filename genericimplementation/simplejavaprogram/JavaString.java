package genericimplementation.simplejavaprogram;

public class JavaString {
    /**
     * Author: Usman Muhammad
     * Purpose: Siwes report
     * Course of study: Bsc Computer science
     * Program Description: Demonstration of the String class in Java program
     */
    public static void main(String[] args) {
        String stringDemo = "I LIKE MY LECTURERS";
        String stringDemoTwo = stringDemo.concat(", THEY LECTURE US TO THE BEST OF THEIR ABILITY");

        String stringDemoThree = stringDemoTwo;
        boolean isEqual = stringDemoTwo.equals(stringDemoThree);

        if (isEqual) {
            System.out.println("StringDemoTwo is equal to stringDemoThree");

            System.out.println("---------------------------------------------");
            System.out.println("\t\t\tCOOL IS EQUAL");
            System.out.println("---------------------------------------------");
            System.out.println();

            System.out.println(stringDemoThree);
            int strLength = stringDemoThree.length();

            System.out.println("I'm stringDemoThree with total length of: " + strLength);
        }
    }
}
