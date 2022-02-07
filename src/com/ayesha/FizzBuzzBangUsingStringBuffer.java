package com.ayesha;

public class FizzBuzzBangUsingStringBuffer {
    public static void main(String[] args) {
        int n = 150;

        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 5 == 0)
                s = s + " Buzz ";
            if (i % 3 == 0)
                s = s + " Fizz ";
            if (i % 7 == 0) {
                s = s + " Bang ";
            }

            System.out.println(s.equals("") ? i : s);
        }
    }
}
