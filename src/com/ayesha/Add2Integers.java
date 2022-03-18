package com.ayesha;

import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args) {
        int num1, num2, sum;
        System.out.print("Enter the value of num1 and num2:");
        Scanner sc=new Scanner(System.in);
        num1= sc.nextInt();
        num2=sc.nextInt();

        sum=num1+num2;
        System.out.println("The sum of num1 and num2 is " +sum);
    }
}
