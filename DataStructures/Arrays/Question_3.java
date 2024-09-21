// Find smallest in array - time complexity o(n)

package com.DataStructures.Arrays;

import java.util.Scanner;

public class Question_3 {

    public static int findGreatest(int[] arr){
        int min = Integer.MAX_VALUE; // +infinity
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter the length of array: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = findGreatest(arr);
        System.out.println("The smallest number in array is: "+smallest);
    }
}
