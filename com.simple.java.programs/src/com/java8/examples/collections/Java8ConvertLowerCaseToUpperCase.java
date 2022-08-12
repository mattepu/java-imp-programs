package com.java8.examples.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Java8ConvertLowerCaseToUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d");

        List<String> collect = strings.stream().map(element -> element.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
