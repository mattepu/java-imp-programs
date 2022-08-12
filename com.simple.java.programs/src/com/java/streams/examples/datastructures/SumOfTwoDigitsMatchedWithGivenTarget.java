package com.java.streams.examples.datastructures;

/**
 * which two numbers sum is equalent to targeted number 17
 */
public class SumOfTwoDigitsMatchedWithGivenTarget {
   //find the any two number sum is equal to 17
    public static void main(String[] args) {
        int numbers[] = {1, 10, 8 , 9 , 7, 16};

        System.out.println("length or size of the arrray = " + numbers.length);

        for (int i = 0; i<numbers.length; i ++) {
            for (int j=i+1; j<numbers.length; j++) {
                if(numbers[i] + numbers[j] == 17) {
                    System.out.println("Pair numbers reached the targed "+ numbers[i] +" "+ numbers[j]);
                }
            }
        }

    }
}
