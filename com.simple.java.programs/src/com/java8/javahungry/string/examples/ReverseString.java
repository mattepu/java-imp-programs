package com.java8.javahungry.string.examples;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ABC";
        char[] chars = str.toCharArray();
        char [] reverseString = new char[chars.length];
        int length = chars.length;
        int j = 0;
        for(int i=length; i>=1; i--) {
            reverseString[j] = chars[i-1];
            j++;
        }
        System.out.println("Actual String " + String.valueOf(chars));
        System.out.println("Reverse String " + String.valueOf(reverseString));
    }
}
