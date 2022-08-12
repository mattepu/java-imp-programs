package com.java.streams.examples.datastructures;

/**
 * Find the largest element in the array
 */
public class FindLargestElementInArray {
    
    public static void main(String[] args) {
        int numbers[] = {50, 43, 33, 90, 3};
        int largerNumber = numbers[0];
        for(int num : numbers) {
            if(largerNumber < num) {
                largerNumber = num;
            }
        }
        System.out.println("the largest number is " + largerNumber);
    }
}
