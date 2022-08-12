package com.practice.arrays;

import java.util.Arrays;

public class FindTheLargestNumberInArray {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3,3, 4, 4,5};
        int asInt = Arrays.stream(numbers).max().getAsInt();
        System.out.println("max " + asInt);

        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Min " + min);

        System.out.println("size or length of the array " + numbers.length);

        //get distinct count
        long count = Arrays.stream(numbers).distinct().count();
        System.out.println("unique numbers count " + count);



    }
}
