package com.java.streams.examples;

import java.util.ArrayList;
import java.util.List;

public class FindDistictElementsInList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("B");names.add("B");names.add("C");
        names.add("C");names.add("D");names.add("D");

        long count = names.stream().distinct().count();
        System.out.println("Distinct elements in list are - " + count);


    }
}
