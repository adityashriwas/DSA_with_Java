// Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct

package com.DataStructures.Arrays;

import java.util.Arrays;

public class Question_11 {

    public static boolean check(int[] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,4,3};
        System.out.println(check(arr));
    }
}
