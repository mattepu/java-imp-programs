package com.java.streams.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumListOfIntegers {
    public static void main(String[] args) {
        int numer[] = {1, 2, 3};
        int sum = Arrays.stream(numer).sum();
        System.out.println("sum -> " + sum);
    }
}
