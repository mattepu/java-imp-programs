package com.java.streams.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstAndFindAnyInStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of();
        Optional<Integer> first = integerStream.findFirst();
        if(first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("integer optional is empty or null");
        }

        //System.out.println("Find Any " + integerStream.findAny());
        //integerStream.limit(3).forEach(System.out::println);
        //integerStream.skip(3).forEach(System.out::println);
    }
}
