package com.java8.javahungry;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindTheFirstElementInStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49, 49,25,98,32, 98);
        Optional<Integer> first = myList.stream().findFirst();
        System.out.println("FirstNumber -> " +first);
    }
}
