package com.java.streams.examples;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindStringLengths {
    public static void main(String[] args) {
        //it will count the string of length
        Map<String, Integer> map = Stream.of("bla", "blabla", "blablabla").distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(map);

        //it will find the how many times the word repeated
        Map<String, Long> map1 = Stream.of("bla", "blabla", "blablabla").distinct()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map1 "+map1);
    }
}
