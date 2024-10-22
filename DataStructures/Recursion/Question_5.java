// print the sum of first n natural numbers

package com.DataStructures.Recursion;

public class Question_5 {

    public static int calculateSum(int number){
        if(number == 1){
            return 1;
        }
        int sum = number + calculateSum(number - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }
}
