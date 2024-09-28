package com.DataStructures.TWO_D_Array;

import java.util.Scanner;

public class Question_2 {
    // Brute force - O(n^2)
//    public static void search(int[][] mat, int search){
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[0].length; j++) {
//                if (mat[i][j] == search){
//                    System.out.println(search+" is on "+(i+1)+" row and "+(j+1)+" column");
//                    return;
//                }
//            }
//        }
//        System.out.println("Element not found!");
//    }


//    public static boolean search(int[][] mat, int search){
//        int row = 0, col = mat[0].length-1;
//        while (row < mat.length && col >=0){
//            if (mat[row][col] == search){
//                System.out.println("found at ("+row+","+col+")");
//                return true;
//            } else if (search < mat[row][col]) {
//                col--;
//            }else {
//                row++;
//            }
//        }
//        System.out.println("Key not found!");
//        return false;
//    }

    public static boolean search(int[][] mat, int search){
        int row = mat[0].length-1, col = 0;
        while (row >= 0 && col < mat.length-1 ){
            if (mat[row][col] == search){
                System.out.println("found at ("+row+","+col+")");
                return true;
            } else if (search > mat[row][col]) {
                col++;
            }else {
                row--;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        search(mat, 14);
    }
}
