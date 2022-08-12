package com.java.streams.examples;

import java.util.Arrays;

public class SortArrayAndConvertToStream {
    public static void main(String[] args) {
        int numbers[] = {89, 90, 1, 2, 7, 6};
        Arrays.parallelSort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
