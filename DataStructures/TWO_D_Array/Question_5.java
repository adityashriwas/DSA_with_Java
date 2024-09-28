// Digonal sum

package com.DataStructures.TWO_D_Array;

public class Question_5 {

    public static int digonalSum(int[][] matrix){
        int sum = 0;
        // brute force approch - O(n^2)
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {
//                    sum += matrix[i][j];
//                } else if ((i+j) == matrix.length-1) {
//                    sum += matrix[i][j];
//                }
//            }
//        }

        // optimized code - O(n)
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length-i-1) // skip if same element is repeated
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(digonalSum(matrix));
    }
}
