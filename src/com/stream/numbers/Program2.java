package com.stream.numbers;

import java.util.Arrays;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        //average of the numbers
        //transform == map --->Function interface

        double d = numbers.stream()
                .mapToDouble(n->n)
                .average()
                .getAsDouble();

		System.out.println(d);

    }

}