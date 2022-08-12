package com.java.streams.examples;

import java.util.StringJoiner;

/**
 * Get the out put of (a, b ,c,d...)
 */
public class AddStringsUsingStringJoiner {

    public static void main(String[] args) {

        StringJoiner stj = new StringJoiner(",", "(", ")");
        stj.add("a");
        stj.add("b");
        stj.add("c");stj.add("d");
        System.out.println(stj);
    }
}
