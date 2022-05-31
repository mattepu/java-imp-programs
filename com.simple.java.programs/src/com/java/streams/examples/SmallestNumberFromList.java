package com.java.streams.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallestNumberFromList {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<Integer>();
        int numbers[] = {1, 2, 4, 6, 9};

        for(int value : numbers) {
            numbersList.add(value);
        }

       Integer integer =  numbersList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("integer ->  " + integer);
    }
}
