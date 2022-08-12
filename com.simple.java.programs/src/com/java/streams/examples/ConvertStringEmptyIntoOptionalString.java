package com.java.streams.examples;

import java.util.Optional;

public class ConvertStringEmptyIntoOptionalString {
    public static void main(String[] args) {
        String str = null;
        //Optional<String> str1 = Optional.of(str);
        Optional<String> str1 = Optional.ofNullable(str);
        System.out.println("My Name " + str1.filter(s -> !s.isEmpty()).get());
        if(str1.isPresent()) {
            System.out.println("The String value is " +str1.get());
        } else {
            System.out.println("it's a empty string ");
        }

        //concat
        String str3 = "mahesh";

        ////////////Another way
        Optional<String> emptyString = Optional.ofNullable(str);
        if(emptyString.isPresent()) {
            System.out.println("Present the value -> " + emptyString);
        } else {
            System.out.println("Empty value");
        }
    }
}
