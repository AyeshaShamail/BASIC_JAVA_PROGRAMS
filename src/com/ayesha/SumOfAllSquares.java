// Modify the program to find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100.
package com.ayesha;

public class SumOfAllSquares {
    public static void main(String[] args) {
        int LOWERBOUND=1;
        int UPPERBOUND=100;
        int sum=0;

        for(int i=1; i<=100;i++){
            sum+= (i*i);
        }
        System.out.println("Sum of squares of natural numbers:" +sum);


    }
}
