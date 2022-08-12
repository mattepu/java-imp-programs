package com.practice.arrays;

public class ReverseTheArrayElements {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3 ,4};
        int length = numbers.length;
        int [] reversNumber = new int[numbers.length];
        int j = 0;
        int number = 0;
        for(int i=length; i>=1; i--) {
            number = numbers[i-1];

            reversNumber[j] = number;
            j++;
        }
        System.out.println("reverse array length" + reversNumber.length);
        System.out.println("reverse array length" + reversNumber);

    }
}
