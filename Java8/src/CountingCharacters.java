/**
 * Given a string, write a program to count the occurrences of each character.
 */
package com.app;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingCharacters {

    public static Map<Character, Long> countCharacters(String str) {
        return str.chars()  // Convert string to a stream of char values (int)
                .mapToObj(c -> (char) c) // Convert int values back to chars
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // groups characters by themselves and counts their occurrences.
    }

    public static void main(String[] args) {
        String s = "Hello";
        Map<Character, Long> freqMap = countCharacters(s);
        System.out.println(freqMap); // {e=1, H=1, l=2, o=1}
    }

}