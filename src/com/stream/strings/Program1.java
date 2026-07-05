package com.stream.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {

        String str = "aabcdefghijkllmnopq";

        List<String> list = Arrays.asList(str.split(""));

        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }

}
