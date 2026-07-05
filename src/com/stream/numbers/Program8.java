package com.stream.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program8 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        //asc and desc

        List<Integer> list = numbers.stream()
                .sorted()
                .toList();

        System.out.println(list);

        //desc

        List<Integer> list1 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(list1);

    }

}