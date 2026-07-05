package com.stream.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        //max and min

        Integer integer = numbers.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(integer);

        Integer integer2 = numbers.stream()
                .min(Comparable::compareTo)
                .get();
        System.out.println(integer2);


    }

}