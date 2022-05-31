package com.java.streams.examples;

import java.util.Arrays;

public class ReduceMethod {
    public static void main(String[] args) {
        int [] numbers = {23, 1, 1, 1};
        int reduce = Arrays.stream(numbers).reduce(23, (a, b) -> a + b);
        System.out.println(reduce);
    }


}
