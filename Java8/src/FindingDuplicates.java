/**
 * Given a string, find characters that appear more than once.
 */
package com.app;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingDuplicates {

    private static Map<Character, Long> findDuplicateCharacters(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Similar to counting characters, but filters the results to include only characters that appear more than once.
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // {a=2}
    }

    public static void main(String[] args) {
        String s = "Balaji";
        Map<Character, Long> freqMap = findDuplicateCharacters(s);
        System.out.println(freqMap); // {l=2}
    }

}
