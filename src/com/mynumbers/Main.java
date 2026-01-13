/**
 *  Java program to use static methods of java.lang.Math.
 */

package com.mynumbers;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Cresting random integers number.
        double number = Math.random();

        // Printing number to console.
        System.out.println("Number: " + number);

        // Getting number from string
        double number1 = Double.valueOf("3.9");

        // Printing number1 to console.
        System.out.println("Number: " + number1); // Output: 'Number: 3.9'

        // Converting an integer to string
        String str = Integer.toString(9);

        // Printing string to console.
        System.out.println(str); // Output: '9'

        // Adding two numbers.
        int result = Math.addExact(5, 4);

        // Printing the result to console.
        System.out.println(result); // Output: '15'

        // Adding two numbers.
        long result1 = Math.addExact(2147483647, 2147483647L);

        // Printing the result to console.
        System.out.println(result1); // Output: 4294967294

        // Decrementing number by 1.
        int number2 = Math.decrementExact(12);

        // Printing number2 to console.
        System.out.println("Number: " + number2); // Output: 'Number: 11'

        // Counting rest of division.
        int number3 = Math.floorMod(7, 2);

        // Printing number3 to console.
        System.out.println("Mod : " + number3); // Output: 'Mod : 1'

        // Counting natural log with base e = 2.718 of number.
        double number4 = Math.log(1);

        // Printing number4 to console.
        System.out.println("Ln: " + number4); // Output: '0.0'

        // Counting log of number.
        double number5 = Math.log10(1000);

        // Printing number5 to console.
        System.out.println("Log: " + number5); // Output: '3.0'

    }
}
