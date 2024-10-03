// Chocolate Distribution problem

package com.DataStructures.Arrays;

import java.util.Arrays;

public class Question_17 {

    public static int chocolateDP(int[] arr, int students){
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-students; i++) {
            int packet_min = arr[i];
            int packet_max = arr[i+students-1];
            result = Math.min(result, packet_max-packet_min);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};
        System.out.println(chocolateDP(arr,7));
    }
}
