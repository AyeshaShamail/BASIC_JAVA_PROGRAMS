package com.ayesha;

import java.util.Scanner;

public class PercentageCalcForCBSE {

        public static void main(String[] args) {
            System.out.println("CBSE PERCENTAGE CALCULATOR");
            Scanner sc = new Scanner(System.in);
            float total=600;
            System.out.println("Enter the marks of Mathematics-1");
            float mathematics = sc.nextInt();
            System.out.println("Enter the marks of Physics");
            float physics=sc.nextInt();
            System.out.println("Enter the marks of Electrical machines");
            float EMC = sc.nextInt();
            System.out.println("Enter the marks of CCP");
            float CCP = sc.nextInt();
            System.out.println("Enter the marks of Mechanics");
            float mech = sc.nextInt();
            System.out.println("Enter the marks of drawing");
            float drawing = sc.nextInt();
            float sum= mathematics+physics+EMC+CCP+mech+drawing;
            System.out.println("Total marks obtained out of 600 is:" );
            System.out.println(sum);
            float percentage = (sum/total)*100;
            System.out.println("Obtained Percentage is:");
            System.out.println(percentage);

        }
    }


