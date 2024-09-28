// Number Matrix Pattern

package com.DataStructures.Patterns;

public class Pattern_15 {
    public static void printPattern(int n){
        int ogn = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int index = ogn - (Math.min(Math.min(row, col), Math.min(n-row, n-col)));
                System.out.print(index+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(4);
    }
}
