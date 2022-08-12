package com.steams.duplicates.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findduplicate {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,3,5,5,5,6,6,6);
        Set<Integer> duplicateNumbersSet = new HashSet<>();

        // method 1
        Set<Integer> collect = integerList.stream().filter(num -> !duplicateNumbersSet.add(num)).collect(Collectors.toSet());
        System.out.println(collect);

        //method 2 display the characters with number of times
        Map<Integer, Long> collect1 = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

        //method 3 display the repeated numbers frequency greather than 1
        Set<Integer> collect2 = integerList.stream().filter(num -> Collections.frequency(integerList, num) > 1).collect(Collectors.toSet());
        System.out.println(collect2);


    }
}
