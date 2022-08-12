package com.java8.examples.collections;

import java.util.stream.Stream;

public class Java8StreamBuilderMethod {
    public static void main(String[] args) {
        Stream<String> stringBuilder = Stream.<String>builder().add("a").add("b").build();
        stringBuilder.forEach(System.out::println);
    }
}
