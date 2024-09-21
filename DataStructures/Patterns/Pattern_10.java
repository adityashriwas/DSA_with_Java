// Hollow Solid Rhombus pattern

package com.DataStructures.Patterns;

public class Pattern_10 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num ; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
