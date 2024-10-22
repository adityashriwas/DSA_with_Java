package com.DataStructures.Recursion;

public class Question_9 {

    public static int lastOccurence(int[] arr, int key, int size){
        if (size == -1){
            return -1;
        }

        if(arr[size] == key){
            return size;
        }

        return lastOccurence(arr, key, size-1);

    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,34,78,59,2,3,4};
        System.out.println(lastOccurence(arr, 2   , arr.length-1));
    }
}
