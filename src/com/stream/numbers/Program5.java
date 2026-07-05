package com.stream.numbers;

import java.util.Arrays;
import java.util.List;

public class Program5 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        // ignore first 5 numbers

        List<Integer> list = numbers.stream()
                .skip(5)
                .toList();

        System.out.println(list);

    }

}