// Counting sort

package com.DataStructures.Sorting;

public class Question_4 {

    public static void countSort(int[] nums){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int[] count = new int[largest+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,5,7,1,5,1};
        countSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
