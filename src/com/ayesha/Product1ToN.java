package com.ayesha;

public class Product1ToN {
    public static void main(String[] args) {
      //  int product=1; //for N= 1 to 12
        long product=1; //for N=13 onwards since int can't store product value of 13
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 13;

        for(int i=1;i<=13;i++){
            product=product*i;
        }
        System.out.println("The product of first 10 natural numbers is:" +product);
    }
}
