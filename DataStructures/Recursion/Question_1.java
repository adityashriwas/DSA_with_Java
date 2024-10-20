// Print numbers from n to 1 in (decreasing order)

package com.DataStructures.Recursion;

public class Question_1 {

    public static void printNumbers(int number) {
        if(number == 0){
            return;
        }
        System.out.print(number+" ");
        printNumbers(number-1);
    }

    public static void main(String[] args) {
        int number = 10;
        printNumbers(number);
    }
}
