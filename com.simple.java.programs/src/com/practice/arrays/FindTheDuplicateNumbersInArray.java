package com.practice.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDuplicateNumbersInArray {
    public static void main(String[] args) {
        Integer numbers [] = {1, 3, 3, 2, 5,5, 4,7};
        /*Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();
        List<Integer> arrayList = Arrays.asList(numbers);

        for(Integer number : arrayList) {
            if(uniqueNumbers.contains(number)) {
                duplicateNumbers.add(number);
                System.out.println("Duplicate Numbers " + number);
            } else {
                uniqueNumbers.add(number);
                System.out.println("Unique Number " + number);
            }

        }*/
        // using java8
        Set<Integer> uniqueElements = new HashSet<>();

        Set<Integer> duplicateElements =
                Arrays.stream(numbers).filter(i -> !uniqueElements.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateElements);
        Optional<Integer> first = Arrays.stream(numbers).findAny();
        System.out.println(first);
    }
}
