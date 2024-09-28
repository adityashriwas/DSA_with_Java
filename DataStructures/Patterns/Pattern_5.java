// Inverted half pyramid with the numbers pattern
package com.DataStructures.Patterns;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= num-i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
