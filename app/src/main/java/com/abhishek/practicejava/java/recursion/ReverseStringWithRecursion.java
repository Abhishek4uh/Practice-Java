package com.abhishek.practicejava.java.recursion;

public class ReverseStringWithRecursion {
    public static String reverse(String str) {
        //Base case: if the string has only one character just Return that string
        if (str.length() == 1) {
            return str;
        }

        //Recursive case: reverse the rest and add the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
