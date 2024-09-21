// Linear Search - time complexity O(n)

package com.DataStructures.Arrays;

import java.util.Scanner;

public class Question_1 {

    public static int linearSearch(int[] arr, int key){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter the length of array: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key to find: ");
        int key = sc.nextInt();
        int index = linearSearch(arr, key);

        if (index == -1){
            System.out.println("KEY NOT FOUND!");
        }else{
            System.out.println("Key is at index "+ index);
        }
    }
}
