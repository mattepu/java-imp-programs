package com.java.streams.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatinateTwoStreams {
    public static void main(String[] args) {
        String names[] = {"A", "B", "C"};
        String names2[] = {"D", "E", "F"};
        Stream<String> concat = Stream.concat(Arrays.asList(names).stream(), Arrays.asList(names2).stream());
        concat.sorted().forEach(System.out::println);
    }
}
