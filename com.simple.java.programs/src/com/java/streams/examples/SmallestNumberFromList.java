package com.java.streams.examples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmallestNumberFromList {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<Integer>();
        int numbers[] = {1, 2, 2, 4, 6, 9};

        for(int value : numbers) {
            numbersList.add(value);
        }

       Integer integer =  numbersList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("integer ->  " + integer);
       List<Integer> numaricList = Arrays.asList(1,1,1,2,3);
        Set<Integer> collect = numaricList.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
