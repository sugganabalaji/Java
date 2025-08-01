/**
 * Write a Java program to find elements in an array that start with the digit 1.
 */
package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsStartingWith1 {

    private static List<String> findElementsStartingWithOne(int[] numbers) {
        return Arrays.stream(numbers)
                .boxed()
                .map(String::valueOf) // Converts numbers to strings
                .filter(s -> s.startsWith("1")) // filters those that start with the digit 1.
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 11, 21, 31, 42, 56, 23, 16};
        List<String> result = findElementsStartingWithOne(input);
        System.out.println(result); // [1, 11, 16]
    }

}
