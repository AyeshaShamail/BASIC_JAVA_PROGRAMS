package com.ayesha;


import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sn.nextInt();
        if(n==0)
            System.out.println("The number is ZERO");
        else if(n>0)
            System.out.println("The number is POSITIVE");
        else
            System.out.println("The number is NEGATIVE");
    }
}
