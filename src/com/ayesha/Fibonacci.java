package com.ayesha;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fnMinus1 = 0;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");

        int sum = 0;
        while (n <= nMax) {  // n starts from 3
            sum = fnMinus1 + fnMinus2;
            fnMinus1 = fnMinus2;
            fnMinus2 = sum;
            n++;
            System.out.print(sum + " ");
        }

        // Compute and display the average (=sum/nMax).
        // Beware that int/int gives int.
        average = (double) sum / nMax;
        System.out.println();
        System.out.println("The average is:" + average);
    }
}
