/**
 * Compute the sum of harmonics series from left-to-right and right-to-left.
 */

//not sure about this program,just tried
package com.ayesha;
public class HarmonicSum {
    public static void main (String[] args) {
        final int N = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        // for-loop for summing from left-to-right
        for (int i = 1; i <= N; i++) {
            sumL2R+= (double) (1);
            sumR2L+= (double)(1)/(N-i+1);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        System.out.println("The sum from right-to-left is: " + sumR2L);
        // Find the absolute difference and display
        if (sumL2R > sumR2L){
            absDiff = sumL2R-sumR2L ;
    } else {
        absDiff =sumR2L-sumL2R ;
    }
        System.out.println("The absolute difference:" +absDiff);

}
}


