// maximum sum of sub arrays Time Complexity - O(n^3)

package com.DataStructures.Arrays;

public class Question_8 {
    public static void maxOfSubArrays(int[] arr){
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += arr[k];
                }
                if (currentsum > maxSum) {
                    maxSum = currentsum;
                }
                System.out.println("Sum is: "+currentsum);
            }
            System.out.println();
        }
        System.out.println("max of sub Arrays: "+ maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxOfSubArrays(arr);
    }
}
