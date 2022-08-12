package com.java8.javahungry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElementInListUsingStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49, 49,25,98,32, 98);
        Integer maxNumber = myList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("maxNumber " +maxNumber);
        Integer minNumber = myList.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("minNumber " + minNumber);
    }
}
