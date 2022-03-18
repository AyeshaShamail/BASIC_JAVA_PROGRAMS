package com.ayesha;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int sum, product, min, max;

        System.out.println("Enter the value of num1:  ");
        Scanner sc = new Scanner(System.in);
        num1= sc.nextInt();
        System.out.println("Enter the value of num2:  ");
        num2=sc.nextInt();
        System.out.println("Enter the value of num3:  ");
        num3= sc.nextInt();


        // Compute sum and product
        sum =num1+num2+num3;
        product =num1*num2*num3;
        System.out.println("The sum of 3 numbers is :" +sum);
        System.out.println("The product of 3 numbers is :" +product);

        // Compute min
        // The "coding pattern" for computing min is:
        // 1. Set min to the first item
        // 2. Compare current min with the second item and update min if second item is smaller
        // 3. Repeat for the next item
        min = num1;        // Assume min is the 1st item
        if (num2 < min) {  // Check if the 2nd item is smaller than current min
            min = num2;     // Update min if so
        }
        if (num3 < min) {  // Continue for the next item
            min = num3;
        }

        System.out.println("The min of 3 numbers is :" +min);

        // Compute max
        max = num1;        // Assume min is the 1st item
        if (num2 > max) {  // Check if the 2nd item is smaller than current min
            max = num2;     // Update min if so
        }
        if (num3 > max) {  // Continue for the next item
            max = num3;
        }
        System.out.println("The max of 3 numbers is :" +max);
    }
}
