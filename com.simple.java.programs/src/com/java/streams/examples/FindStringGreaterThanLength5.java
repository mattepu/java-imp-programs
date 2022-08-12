package com.java.streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringGreaterThanLength5 {
    public static void main(String[] args) {
        String names[] = {"mahesh", "Ramesh", "Lalith", "Parni"};
        List<String> collect = Arrays.stream(names).sorted().filter(name -> name.length() > 5).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }

        //append some suffix to the name
        Arrays.stream(names).sorted().map(name -> name.concat(".M")).forEach(System.out::println);

    }
}
