package com.java8.javahungry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
 */
public class FindDuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49, 49,25,98,32, 98);
        Set<Integer> duplicateSet = new HashSet<Integer>();

        Set<Integer> collect = myList.stream().filter(n -> !duplicateSet.add(n)).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
