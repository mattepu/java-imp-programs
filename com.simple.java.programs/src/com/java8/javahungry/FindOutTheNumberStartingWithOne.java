package com.java8.javahungry;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutTheNumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<String> collect = myList.stream().map(number -> number + "")
                               .filter(string -> string.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
