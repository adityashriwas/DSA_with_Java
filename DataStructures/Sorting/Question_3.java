// Insertion sort - O(n^2)
package com.DataStructures.Sorting;

public class Question_3 {

    public static void insertionSort(int[] nums){
        for (int i = 1; i < nums.length ; i++) {
            int curr = nums[i];
            int prev = i-1;
            // find out the correct position to insert
            while (prev >=0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }
            nums[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,2,0,1,2,1};
        insertionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
