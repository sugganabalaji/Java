package com.stream.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program9 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        List<Integer> list = numbers.stream()
                .sorted()
                .toList();

        System.out.println(list);

        //second highest

        Integer integer = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(integer);

        //second lowest

        Integer integer1 = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        System.out.println(integer1);

    }

}