// Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
package com.ayesha;

    public class CheckPassFail {
        public static void main(String[] args) {
            int mark = 100;
            System.out.println("The mark is " + mark);

            // if-else statement
            if ( mark>=50 ) {
                System.out.println("PASS");
            } else {
                System.out.println( "FAIL" );
            }
            System.out.println( "DONE" );
        }
    }

//Try mark = 0, 49, 50, 51, 100 and verify your results.