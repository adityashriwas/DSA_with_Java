// Patter 3: Hollow Rectangle

package com.DataStructures.Patterns;

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of row and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col ; j++) {
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
