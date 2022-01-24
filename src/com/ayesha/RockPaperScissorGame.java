package com.ayesha;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the game of ROCK-PAPER-SCISSOR");
        System.out.println("................................................");
        System.out.println("Let's begin the game,0-ROCK, 1-PAPER, 2-SCISSOR");
        System.out.println("................................................");
        System.out.print("Choose your number:");
        Scanner sc=new Scanner(System.in);
        Random choice=new Random();

        int Computer= choice.nextInt(3);
        int Player=sc.nextInt();

        if(Computer==0 && Player==1)
        {
            System.out.println("Computer Chose ROCK");
            System.out.println("You Chose PAPER");
            System.out.println("ANDDDD CONGO, YOU WON!!!!");
        }
        else if(Computer==0 && Player==2)
        {
            System.out.println("Computer Chose ROCK");
            System.out.println("You Chose SCISSORS");
            System.out.println("SORRY!!!!COMPUTER WON");
        }
        else if(Computer==0 && Player==0)
        {
            System.out.println("Computer Chose ROCK");
            System.out.println("You Chose ROCK");
            System.out.println("OOPS!!!,IT'S A TIE");
        }
        else if(Computer==1 && Player==2)
        {
            System.out.println("Computer Chose PAPER");
            System.out.println("You Chose SCISSOR");
            System.out.println("ANDDDD CONGO, YOU WON!!!!!");
        }
        else if(Computer==1 && Player==0)
        {
            System.out.println("Computer Chose PAPER");
            System.out.println("You Chose ROCK");
            System.out.println("SORRY!!!!,COMPUTER WON");
        }
        else if(Computer==1 && Player==1)
        {
            System.out.println("Computer Chose PAPER");
            System.out.println("You Chose PAPER");
            System.out.println("OOPS!!!IT'S A TIE");
        }
        else if(Computer==2 && Player==1)
        {
            System.out.println("Computer Chose SCISSOR");
            System.out.println("You Chose PAPER");
            System.out.println("SORRY!!!COMPUTER WON");
        }
        else if(Computer==2 && Player==2)
        {
            System.out.println("Computer Chose SCISSOR");
            System.out.println("You Chose SCISSOR");
            System.out.println("OOPS!!!IT'S A TIE");
        }
        else if(Computer==2 && Player==0)
        {
            System.out.println("Computer Chose SCISSOR");
            System.out.println("You Chose ROCK");
            System.out.println("ANDDDD CONGO,YOU WON!!!!");
        }
        else
        {
            System.out.println("Enter a valid number");
        }

    }
}
