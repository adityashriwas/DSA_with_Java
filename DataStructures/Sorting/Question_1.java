// Bubble Sort
package com.DataStructures.Sorting;

public class Question_1 {

    public static void bubbleSort(int[] nums){
        int swaps = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Number of swaps: "+swaps);
    }

    public static void main(String[] args) {
        int[] nums = {0,2,0,1,2,1};
        bubbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
