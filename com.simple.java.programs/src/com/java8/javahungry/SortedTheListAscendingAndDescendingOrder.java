package com.java8.javahungry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
 */
public class SortedTheListAscendingAndDescendingOrder {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49, 49,25,98,32, 98);
        List<Integer> collect = myList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Integers " + collect);
        List<Integer> descendingOrder = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(" Descending Order Numbers " + descendingOrder);
    }
}
