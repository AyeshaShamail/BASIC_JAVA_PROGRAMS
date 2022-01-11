package com.ayesha;

import java.util.Scanner;

public class FindFactorial {

    public static void main(String[] args){
        int i,a, factorial=1;
        System.out.println("Enter the number:");
        Scanner sn= new Scanner(System.in);
        a= sn.nextInt();

        for(i = 1; i<=a; i++) {
            factorial = factorial * i;
        }
        System.out.println("The result is: "+factorial);
    }
}
