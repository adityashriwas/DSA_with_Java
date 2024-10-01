// is valid palindrome String

package com.DataStructures.Strings;

public class Question_1 {

    public static boolean isPalindrome(String s){
        StringBuilder newstr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                newstr.append(Character.toLowerCase(ch));
            }
        }

        int start = 0;
        int end = newstr.length() - 1;
        while (start <= end) {
            if (newstr.charAt(start) != newstr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
