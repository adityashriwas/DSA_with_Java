package com.DataStructures.Recursion;

public class Question_11  {

    public static int tilingProblem(int n){
//      base case
        if (n == 0 || n ==1) {
            return 1;
        }

//      vertical choice
        int fnm1 = tilingProblem(n-1);

//      horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(2));
    }
}
