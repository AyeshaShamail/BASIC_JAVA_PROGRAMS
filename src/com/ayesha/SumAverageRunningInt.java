/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
package com.ayesha;
public class SumAverageRunningInt {
    public static void main (String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
       /* for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        } */

        // using while-do loop
      /*  int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        } */

        // using do-while loop
        int number = LOWERBOUND;         // declare and init loop index variable
        do {
            sum += number;
            ++number;                     // update
        } while (number <= UPPERBOUND);


        // Compute average in double. Beware that int / int produces int!
      average= sum/(LOWERBOUND+UPPERBOUND);
        System.out.println("The SUM is: " +sum);
        System.out.println("The AVERAGE is: " +average);
    }
}

