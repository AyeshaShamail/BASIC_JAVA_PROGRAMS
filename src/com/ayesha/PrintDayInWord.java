package com.ayesha;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        int DayNumber=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Day Number:");
        DayNumber=sc.nextInt();

      /*  if(DayNumber==0){
            System.out.println("SUNDAY");
            }
        else if(DayNumber==1){
            System.out.println("MONDAY");
        }
        else if(DayNumber==2){
            System.out.println("TUESDAY");
        }
        else if(DayNumber==3){
            System.out.println("WEDNESDAY");
        }
        else if(DayNumber==4){
            System.out.println("THURSDAY");
        }
        else if(DayNumber==5){
            System.out.println("FRIDAY");
        }
        else if(DayNumber==6){
            System.out.println("SATURDAY");
        }
        else{
            System.out.println("NOT A VALID DAY");
        } */

        // using switch-case-default
        switch(DayNumber) {
            case 0:
                System.out.println( "SUNDAY" ); break;
            case 1:
                System.out.println( "MONDAY" ); break;
            case 2:
                System.out.println( "TUESDAY" ); break;
            case 3:
                System.out.println( "WEDNESDAY" ); break;
            case 4:
                System.out.println( "THURSDAY" ); break;
            case 5:
                System.out.println( "FRIDAY" ); break;
            case 6:
                System.out.println( "SATURDAY" ); break;
            default: System.out.println( "NOT A VALID DAY" );
        }
    }
}
