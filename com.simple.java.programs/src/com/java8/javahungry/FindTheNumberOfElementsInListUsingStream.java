package com.java8.javahungry;

import java.util.Arrays;
import java.util.List;

public class FindTheNumberOfElementsInListUsingStream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49, 49,25,98,32, 98);
        long count = myList.stream().count();
        System.out.println("Total Elements in List = "+count);
        //Find the distinct elements in the list
        long count1 = myList.stream().distinct().count();
        System.out.println("Distinct Elements in List count = " + count1);
    }
}
