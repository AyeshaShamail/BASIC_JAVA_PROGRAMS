package com.ayesha;

public class CozaLozaWoza {
    public static void main(String[] args) {
         int num=110;
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        boolean printed;
        for (int i = 1; i <= num; i++) {
            printed = false;  // init before processing each number
            // Print "Coza" if number is divisible by 3
            if (i%3==0) {
                System.out.print("Coza"+" ");
                printed = true;   // processed!
            }
            // Print "Loza" if number is divisible by 5
            if (i%5==0 ) {
                System.out.print( "Loza"+" ");
                printed = true;   // processed!
            }
            // Print "Woza" if number is divisible by 7
            if (i%7==0 ) {
                System.out.print( "Woza"+" ");
                printed = true;   // processed!
            }

            // Print the number if it has not been processed
            if (!printed) {
                System.out.println(i);
            }
            // After processing the number, print a newline if it is divisible by 11;
            // else, print a space
            if (i % 11 == 0) {
                System.out.println();
            }
            System.out.print("");
        }
    }
}
