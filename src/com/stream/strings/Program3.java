package com.stream.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program3 {

    public static void main(String[] args) {

        String str = "aabcdefghijkllmnopq";

        List<String> list = Arrays.asList(str.split(""));

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        List<Map.Entry<String, Long>> list1 = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .toList();

        System.out.println(list1);

        // print the keys whose value equal 1
        String s = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        System.out.println(s);

    }

}
