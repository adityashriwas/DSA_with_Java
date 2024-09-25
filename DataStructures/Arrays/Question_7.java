// Sub arrays of arrays and there sum Time Complexity - O(n^3)

package com.DataStructures.Arrays;

public class Question_7 {

    public static void subArrays(int[] arr){
        int TotalSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                TotalSubArray++;
                System.out.println();
                System.out.println("Sum is: "+sum);
            }
            System.out.println();
        }
        System.out.println("Total number of sub Arrays: "+ TotalSubArray);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        subArrays(arr);
    }
}
