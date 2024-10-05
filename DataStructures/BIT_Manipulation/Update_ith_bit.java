package com.DataStructures.BIT_Manipulation;

public class Update_ith_bit {

    public static int set_ith_bit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clear_ith_bit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int update_ith_bit(int n, int i, int newbit){
        if (newbit == 0){
            return clear_ith_bit(n,i);
        }else {
            return set_ith_bit(n,i);
        }
    }


    public static void main(String[] args) {
        System.out.println(update_ith_bit(10,1, 1));
    }
}
