package com.java8.javahungry;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindOutEvenNumbersUsingStreams {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter(number -> number % 2 == 0).forEach(System.out::println);// to display the elements
        List<Integer> collect = myList.stream().sorted().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
