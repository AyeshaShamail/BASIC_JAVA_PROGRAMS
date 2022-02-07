package com.ayesha;

public class FizzBuzzBang {
    public static void main(String[] args) {
        int n=150;
        for(int i=1;i<=n;i++){
            if(i%15==0 && i%21==0 && i%35==0)
                System.out.println("Fizz Buzz Bang");
            else if(i%15==0)
                System.out.println("Fizz Buzz");
            else if(i%35==0)
                System.out.println("Buzz Bang");
            else if(i%21==0)
                System.out.println("Fizz Bang");
            else if(i%5==0)
                System.out.println("Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%7==0){
                System.out.println("Bang");
            }
            else
                System.out.println(i);
        }
    }
}
