// print the factorial of a given number

package com.DataStructures.Recursion;

public class Question_3 {

    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * printFactorial(n-1);
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(4));
    }
}
