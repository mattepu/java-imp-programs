package com.java.streams.examples;

import java.util.*;
import java.util.stream.Collectors;

public class Java8FindDuplicateElements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("F","E","D","C","A","A","B","C","A","B");
        Set<String> collect = names.stream().filter(i -> Collections.frequency(names, i) > 1).collect(Collectors.toSet());
        for(String name : collect) {
            System.out.println(name);
        }
    }
}
