package com.java.streams.examples;

import java.util.Arrays;

public class FindLargestElementInArray {

    public static void main(String[] args) {
        int numbers[] = {1, 3, 111, 564, 22, 0, 1};
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(max);
    }
}
