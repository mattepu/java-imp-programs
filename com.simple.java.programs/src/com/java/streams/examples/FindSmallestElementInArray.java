package com.java.streams.examples;

import java.util.Arrays;

/**
 *
 */
public class FindSmallestElementInArray {
    public static void main(String[] args) {
        int numbers[] = {1, 3,5,6,8,9};
        int asInt = Arrays.stream(numbers).min().getAsInt();
        System.out.println("min number -> " + asInt);
    }
}
