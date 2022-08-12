package com.java.streams.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDistictElementsInList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("B");names.add("B");names.add("C");
        names.add("C");names.add("D");names.add("D");
       // names.stream().distinct().forEach(System.out::println);
        //names.stream().distinct();
        List<String> collect = names.stream().distinct().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        System.out.println("Distinct elements in list are - " + collect.size());

        ///////////////// OR ///////////////////
        Set<String> setCollection = names.stream().collect(Collectors.toSet());
        System.out.println("filtering distring elements from list using set");
        setCollection.forEach(System.out::println);


    }
}
