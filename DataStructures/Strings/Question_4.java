// Compressed String

package com.DataStructures.Strings;

public class Question_4 {

    public static StringBuilder compressed(String str){

        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1){
                newstr.append(count.toString());
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        String str = "abbbbbbbbbbbb";
        System.out.println(compressed(str));
    }
}
