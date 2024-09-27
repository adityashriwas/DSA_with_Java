// Given an integer array nums, return true if any value appears at least twice in the
//array, and return false if every element is distinct

package com.DataStructures.Arrays;

public class Question_11 {

    public static boolean check(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4};
        System.out.println(check(arr));
    }
}
