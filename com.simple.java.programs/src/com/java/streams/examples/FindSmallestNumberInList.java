package com.java.streams.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSmallestNumberInList {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int smallest = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(smallest);

    }
}
