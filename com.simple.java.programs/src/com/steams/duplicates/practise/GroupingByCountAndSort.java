package com.steams.duplicates.practise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCountAndSort {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya", "papaya");
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Map<String, Long> sortedKeysMap = new LinkedHashMap<>();
        collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey())
                .forEachOrdered(e -> sortedKeysMap.put(e.getKey(), e.getValue()));
        System.out.println(sortedKeysMap);

    }
}
