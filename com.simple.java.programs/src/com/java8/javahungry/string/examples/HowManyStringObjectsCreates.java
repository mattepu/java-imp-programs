package com.java8.javahungry.string.examples;

public class HowManyStringObjectsCreates {
    public static void main(String[] args) {
        String str = new String("abc");
        String str1 ="abc";
        if(str == str1) {
            System.out.println("object references are same");
        } else {
            System.out.println("object references are different");
        }
    }
}
