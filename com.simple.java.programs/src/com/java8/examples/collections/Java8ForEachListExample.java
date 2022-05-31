package com.java8.examples.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Java8ForEachListExample {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("A"); lists.add("B"); lists.add("C");
        lists.add("D"); lists.add("E"); lists.add("L"); lists.add(null);
        System.out.println(lists);
        for(String s : lists) {
            System.out.println("Names - " + s);
        }

        // how we can write in java8 using Lamda
        lists.forEach(string -> System.out.println(string));
        //using method reference
        lists.forEach(System.out::println);

        // print only non null values that's filter
        lists.stream().filter(Objects::nonNull).forEach(System.out::println);
        //try to append a string at the end of the line


        //print without using streams
        lists.forEach(name -> {
            if (name != null) {
                System.out.println("Print Non Null values " + name+"s");
            }
        });

    }
}
