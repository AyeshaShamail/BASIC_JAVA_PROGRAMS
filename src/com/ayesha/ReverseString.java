package com.ayesha;

    public class ReverseString {
        public static void main(String[] args) {
            // "Ayesha is a software developer"
            // "repoleved erawtfos a si ahseyA"
            // "developer software a is Ayesha

            // this code is to reverse each letter of  above string
        String s= "Ayesha is a software developer";
        String reversedString="";
        for(int i=s.length()-1;i>=0;i--)
            reversedString=reversedString+s.charAt(i);
        System.out.println(reversedString);

            // code to reverse words of above string
          /*  String s= "Ayesha is a software developer";
            String reversedString=""; */



        }

    }

