// Binary Search time complexity - O(log n)

package com.DataStructures.Arrays;

public class Question_4 {

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 0;
        int index = binarySearch(arr, key);
        if (index == -1){
            System.out.println("KEY NOT FOUND!");
        }else{
            System.out.println("Key is at index: " + index);
        }
    }
}
