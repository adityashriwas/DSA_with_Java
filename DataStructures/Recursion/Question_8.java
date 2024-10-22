// find the first occurence of an element

package com.DataStructures.Recursion;

public class Question_8 {

    public static int isOccured(int[] arr, int key, int i){
        if (i == arr.length){
            return -1;
        }

        if (key == arr[i]){
            return i;
        }
        return isOccured(arr, key, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,34,78,59};
        System.out.println(isOccured(arr, 59, 0));
    }
}
