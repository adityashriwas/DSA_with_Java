// Kadans algorithm time complexity - O(n)

package com.DataStructures.Arrays;

import java.util.*;

public class Question_10 {
    
    public static int kadansAlgo(int[] arr){
        boolean flag = false;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                flag = true;
            }else {
                maxsum = Math.max(arr[i], maxsum);
            }
        }
        if (flag){
            for (int i = 0; i < arr.length; i++) {
                currsum += arr[i];
                if (currsum < 0) {
                    currsum = 0;
                }
                maxsum = Math.max(currsum, maxsum);
            }
            return maxsum;
        }else {
            return maxsum;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {-3,-2,-2,-3};
        int max = kadansAlgo(arr);
        System.out.println(max);
    }
}
