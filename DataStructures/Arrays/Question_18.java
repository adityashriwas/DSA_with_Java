// Remove element

package com.DataStructures.Arrays;

import java.util.Arrays;

public class Question_18 {

    public static int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            if (nums[start] == val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            start++;
        }
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }
}
