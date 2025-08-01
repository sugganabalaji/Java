/**
 * Write a Java program to find the longest string in a given array.
 */
package com.app;

import java.util.Arrays;

public class LongestString {

    private static String findLongestString(String[] strArr) {
        return Arrays.stream(strArr)
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
                .orElse(null);
    }

    public static void main(String[] args) {
        String[] input = {"java8", "Microservices", "SpringBoot"};
        String longestString = findLongestString(input);
        System.out.println(longestString); // Microservices
    }

}
