package com.java8.examples.collections;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Java8ForEachMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("null", null);

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            //System.out.println("Key: " + entries.getKey() +" " +"value: " + entries.getValue() );
        }

        //java8
        //map.forEach((k, v) -> System.out.println("Key : " + k + " " + "value: "+ v));

        //java8 print only non null keys and values

        map.forEach((k, v) -> {
            if(k != null && v != null) {
                System.out.println("Key - " + k +" " + "Value - " + v);
            }
        });
    }

}
