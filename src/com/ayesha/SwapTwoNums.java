package com.ayesha;

import java.util.Scanner;

public class SwapTwoNums {

    public static void main(String[] args) {
        int a,b,temp;
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        System.out.println("Enter the value of b:");

        a = sn.nextInt();
        b = sn.nextInt();
        System.out.println("before: "+a +"  "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after: "+a +"  "+ b);
        System.out.println();
    }
}
