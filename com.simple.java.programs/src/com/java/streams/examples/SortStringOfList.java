package com.java.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringOfList {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("A","a","C","D","E","Z","b","X");
        string.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
