// Binary search

package com.DataStructures.Recursion;

public class Question_4 {

    public static void binarySearch(int[] arr, int start, int end, int key) {
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < key){
                binarySearch(arr, start, mid-1, key);
            }else{
                binarySearch(arr, mid+1, end, key);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        binarySearch(arr, 0, arr.length-1, 9);
    }
}
