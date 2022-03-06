/**
     * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
     */
package com.ayesha;
    public class SumAverageRunningInt_2 {
        public static void main (String[] args) {
            int sum = 0;
            double average;
            final int LOWERBOUND = 111;
            final int UPPERBOUND = 8899;

            // Use a for-loop to sum from lowerbound to upperbound
            int count = 0;
            for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
                for (count = 0; count <= UPPERBOUND; ++count)
                    sum += number;
            }
            average = sum / (LOWERBOUND + UPPERBOUND);
            System.out.println("The SUM is: " + sum);
            System.out.println("The AVERAGE is: " + average);
            System.out.println("The COUNT is:" + count);
        }


}
