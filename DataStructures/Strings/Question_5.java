// valid Anagram

package com.DataStructures.Strings;

import java.util.Arrays;

public class Question_5 {

    public static boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();

        if (s_len != t_len){
            return false;
        } else {
            char[] sorted_s = s.toCharArray();
            Arrays.sort(sorted_s);

            char[] sorted_t = t.toCharArray();
            Arrays.sort(sorted_t);

            for (int i = 0; i < s_len; i++) {
                if (sorted_s[i] != sorted_t[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
