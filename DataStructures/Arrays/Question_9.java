// // maximum sum of sub arrays using prefix array Time Complexity - O(n^2)

package com.DataStructures.Arrays;

public class Question_9 {

    public static void maxOfSubArrays(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentsum = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentsum = i == 0 ? prefix[j]: prefix[j] - prefix[i-1];
                if (currentsum > maxSum) {
                    maxSum = currentsum;
                }
            }
        }
        System.out.print("max of sub Arrays: "+ maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        maxOfSubArrays(arr);
    }
}
