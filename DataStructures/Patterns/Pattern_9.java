// Solid Rhombus pattern

package com.DataStructures.Patterns;

public class Pattern_9 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
