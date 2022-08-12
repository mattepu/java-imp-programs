package com.steams.duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates1MethodologyUsingSet {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mahesh", "Anitha", "Parnitha", "Lalith", "Lalith", "Lalith", "Mahesh");
        Set<String> duplicateNames = new HashSet<>();
        Set<String> collect = names.stream().filter(name -> !duplicateNames.add(name)).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
