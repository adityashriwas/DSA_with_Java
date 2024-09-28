// selection Sort - o(n^2)
package com.DataStructures.Sorting;

public class Question_2 {

    public static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,2,0,1,2,1};
        selectionSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
