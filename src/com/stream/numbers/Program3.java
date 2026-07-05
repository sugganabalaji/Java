package com.stream.numbers;

import java.util.Arrays;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        //even and odd

        //separate ==filter==condition

        List<Integer> even = numbers.stream().filter(n -> n%2 == 0).toList();
        System.out.println(even);

        //odd

        List<Integer> odd = numbers.stream().filter(n -> n%2 != 0).toList();
		System.out.println(odd);

    }

}