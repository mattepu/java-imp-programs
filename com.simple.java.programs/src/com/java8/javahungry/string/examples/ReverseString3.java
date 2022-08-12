package com.java8.javahungry.string.examples;

import java.util.*;

public class ReverseString3 {
    public static void main(String[] args) {
        String s = "ABC";
        char[] chars = s.toCharArray();

        List<Character> characterList = new ArrayList<>();
        for(char c : chars) {
            characterList.add(c);
        }
        Collections.reverse(characterList);
        System.out.println(characterList);
    }
}
