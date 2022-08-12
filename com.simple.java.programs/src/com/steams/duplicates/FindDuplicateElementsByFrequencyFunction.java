package com.steams.duplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsByFrequencyFunction {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2,2, 1, 3, 4, 1);
        Set<Integer> collect = numbers.stream().filter(n -> Collections.frequency(numbers, n) > 1).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
