package com.java.streams.examples;

import java.util.Arrays;

/**
 * Using Java8 print even or odd numbers using arrays
 */
public class PrintEvenAndOddNumbersFromArray {


    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //Arrays.stream(numbers).filter(number -> number % 2 == 0).forEach(System.out::println);
        Arrays.stream((numbers)).filter(number -> number % 2 !=0).forEach(System.out::println);
    }

}
