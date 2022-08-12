package com.steams.duplicates;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(null);
        set.add(null);
        set.add("mahesh");
        set.add("uma");
        set.add("ss");

        System.out.println(set); /// HasSet follows internally Hash Table, so HashSet allows only one null value

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        System.out.println(list);

        Set<String> sortedSet = new TreeSet<>();
        sortedSet.add("Mahesh");
        sortedSet.add("ma");
        sortedSet.add("Mahesh");
        sortedSet.add("Mahesh");
    }
}
