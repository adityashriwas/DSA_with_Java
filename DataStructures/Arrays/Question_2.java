// Find greatest in array - time complexity o(n)

package com.DataStructures.Arrays;

import java.util.Scanner;

public class Question_2 {

    public static int findGreatest(int[] arr){
        int max = Integer.MIN_VALUE; // -infinity
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter the length of array: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int greatest = findGreatest(arr);
        System.out.println("The greatest number in array is: "+greatest);
    }
}
