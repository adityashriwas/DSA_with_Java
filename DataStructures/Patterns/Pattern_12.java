// Number Pyramid pattern

package com.DataStructures.Patterns;

public class Pattern_12 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
