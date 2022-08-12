package com.java.streams.examples;

import java.util.Arrays;
import java.util.Optional;

public class FindLargestElementInArray {

    public static void main(String[] args) {
        //primitive types example
        int numbers[] = {1, 3, 111, 564, 22, 0, 1};
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println(max);

        //Integer Object type
        Integer numarics [] = new Integer[] {1 ,3 ,4 ,6};
        Integer integer = Arrays.stream(numarics).max(Integer::compare).get();
        System.out.println("Integer max- " + integer);

        Integer integer1 = Arrays.asList(numarics).stream().max(Integer::max).get();
        System.out.println(" integer1 max " + integer1);

        // anotherway

        int asInt = Arrays.stream(numarics).mapToInt(Integer::intValue).max().getAsInt();
        System.out.println("max int -> " + asInt);
    }
}
