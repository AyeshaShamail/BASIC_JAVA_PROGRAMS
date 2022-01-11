package com.ayesha;

public class GreatestOfThree {
    public static void main(String[] args) {

        int x=500;
        int y=100;
        int z=302;

        if(x>y && x>z)
        {
            System.out.println(" x is greatest number");
        }
        else if(y>x && y>z)
        {
            System.out.println(" y is greatest number");
        }
        else {
            System.out.println("z is greatest");
        }
    }
}
