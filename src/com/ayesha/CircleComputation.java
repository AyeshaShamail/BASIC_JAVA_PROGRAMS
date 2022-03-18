package com.ayesha;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        // Declare variables
        double radius, diameter, circumference, area;

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        Scanner sc= new Scanner(System.in);
        radius = sc.nextDouble();
        //Diameter= radius*radius
        diameter=radius*radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        //Area = PI*radius*radius
        area = Math.PI * (radius * radius);
        System.out.printf("The area of circle is: %.2f%n", area);
        //Circumference = 2*PI*radius
        circumference= Math.PI * 2*radius;
        System.out.printf( "The circumference of the circle is: %.2f%n", circumference) ;

    }
}
