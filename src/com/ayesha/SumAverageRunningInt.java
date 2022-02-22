/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
package com.ayesha;
public class SumAverageRunningInt {
    public static void main (String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 50;
        final int UPPERBOUND = 200;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int / int produces int!
      average= sum/(LOWERBOUND+UPPERBOUND);
        System.out.println("The sum value is: " +sum);
        System.out.println("The Average value is: " +average);
    }
}

