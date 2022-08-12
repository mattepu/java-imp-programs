package com.java.streams.examples.datastructures;

import java.util.HashMap;
import java.util.Map;

/**
 * This program returns how many times the number repeated in an array
 */
public class CountTheNumbersRepeatedInArray {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 1,1,1,3,2};
        Map<Integer, Integer> numbersMap = new HashMap();
        for(int number : numbers) {
            if(numbersMap.containsKey(number)) {
               int value = numbersMap.get(number) + 1;
                numbersMap.put(number, value);
            } else {
                numbersMap.put(number, 1);
            }
        }
        System.out.println(numbersMap);
    }
}
