/**
 * Given a string, find the first unique character.
 */
package com.app;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacter {

    private static Character findFirstUnique(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Using LinkedHashMap to maintain insertion order helps find the first unique character.
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }

    public static void main(String[] args) {
        String input = "Balaji";
        Character firstUnique = findFirstUnique(input);
        System.out.println(firstUnique);
    }


}
