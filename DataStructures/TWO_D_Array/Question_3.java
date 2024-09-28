// Matrix Calculator

package com.DataStructures.TWO_D_Array;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[10][10];
        int[][] mat2 = new int[10][10];
        int[][] temp = new int[10][10];
        System.out.println("Enter the number of row and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the Matrix elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the matrix operation [1-addition][2-subtraction][3-multiplication][4-transpose]");
        int ch = sc.nextInt();
        switch (ch){
            case 1: {
                System.out.println("Enter the second matrix elements:");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        mat2[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        temp[i][j]=mat1[i][j]+mat2[i][j];
                    }
                }
                System.out.println("sum of matrix is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(temp[i][j]+"  ");
                    }
                    System.out.println();
                }
                break;
            }
            case 2:{
                System.out.println("Enter the second matrix elements:");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        mat2[i][j] = sc.nextInt();
                    }
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        temp[i][j]=mat1[i][j]-mat2[i][j];
                    }
                }
                System.out.println("subtraction of matrix is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(temp[i][j]+"  ");
                    }
                    System.out.println();
                }
                break;
            }
            case 3:{
                System.out.println("enter the number of row and columns: ");
                int r1 = sc.nextInt();
                int c1 = sc.nextInt();
                if(r1==col && row==c1) {
                    System.out.println("Enter the second matrix elements:");
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            mat2[i][j] = sc.nextInt();
                        }
                    }


                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            temp[i][j]=0;
                        }

                    }
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < c1; j++) {
                            for (int l = 0; l < col; l++) {
                                temp[i][j] += mat1[i][l] * mat2[l][j];
                            }
                        }
                    }
                    System.out.println("multiplication of matrix is: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (temp[i][j] == 0) {
                                System.out.print("  ");
                            }
                            else
                                System.out.print(temp[i][j] + "  ");
                        }
                        System.out.println();
                    }
                }
                else
                    System.out.println("multiplication can't be done!");
                break;
            }
            case 4:{
                System.out.println("Transpose of matrix is: ");
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        temp[j][i] = mat1[i][j];
                    }

                }
                for (int j = 0; j < col; j++) {
                    for (int i = 0; i < row; i++) {
                        System.out.print(temp[j][i]+"  ");
                    }
                    System.out.println();
                }
                break;
            }
            default:
                System.out.println("Invalid operation!");

        }
    }
}
