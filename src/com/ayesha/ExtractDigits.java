//Write a program called ExtractDigits to extract each digit from an int, in the reverse order.
//For example, if the int is 15423, the output shall be "3 2 4 5 1", with a space separating the digits.

package com.ayesha;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 5;
        while (n > 0) {
            int digit = n % 10;  // Extract the least-significant digit
            // Print this digit
            System.out.println(digit);
            n = n / 10;  // Drop the least-significant digit and repeat the loop
        }
    }
}
