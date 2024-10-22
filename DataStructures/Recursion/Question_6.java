// print the nth fibonacci series

package com.DataStructures.Recursion;

public class Question_6 {

    public static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        int fibofn = fibonacci(n-1) + fibonacci(n-2);
        return fibofn;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(25));
    }
}
