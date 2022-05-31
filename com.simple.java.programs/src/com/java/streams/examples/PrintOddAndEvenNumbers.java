package com.java.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddAndEvenNumbers {

    public static void main(String[] args) {
        Integer numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         List<Integer> list =  Arrays.asList(numbers);
        List<Integer> evenNumbers = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println("Even Numbers " + evenNumbers);
        System.out.println("Odd Numbers " + oddNumbers);
    }
}
