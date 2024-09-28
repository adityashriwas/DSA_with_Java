// Traverse a 2D matrix

package com.DataStructures.TWO_D_Array;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]mat = new int[10][10];
        System.out.println("Enter the number of row and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the Matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
