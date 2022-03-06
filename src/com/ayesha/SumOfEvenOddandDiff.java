package com.ayesha;

public class SumOfEvenOddandDiff {
    public static void main(String[] args) {
        int sumOdd  = 0;   // Accumulating sum of odd numbers
        int sumEven = 0;   // Accumulating sum of even numbers
        int absDiff;       // Absolute difference between the two sums
        // Compute sums
        for (int i=1;i<=100;i++) {
            if (i%2!=0) {
                sumOdd +=i;
            } else {
                sumEven +=i;
            }
            System.out.println("Sum of odd numbers:" +sumOdd);
            System.out.println("Sum of even numbers:" +sumEven);
        }
        // Compute Absolute Difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd-sumEven ;
        } else {
            absDiff =sumEven-sumOdd ;
        }
        System.out.println("The absolute difference:" +absDiff);

    }
}

