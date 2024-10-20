// print number in increasing order

package com.DataStructures.Recursion;

public class Question_2 {

    public static void printNumber(int number){
        if(number == 1){
            System.out.print(number);
            return;
        }
        printNumber(number-1);
        System.out.print(number+" ");
    }

    public static void main(String[] args) {
        int number = 10;
        printNumber(number);
    }
}
