package com.ayesha;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {101,25,39,44,57,65, 90, 52, 99, 20, 80};
        int l= arr.length;
        int n= Math.floorDiv(arr.length,2);
        int temp;
        for(int i=0;i<n;i++){
            //Swap a[i] and a[l-1-i]
            // a b temp
            //|4| |3| ||
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element:arr){
            System.out.print(element + " ");
        }
    }
}
