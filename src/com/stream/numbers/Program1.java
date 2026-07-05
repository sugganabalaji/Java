package com.stream.numbers;

import java.util.Arrays;
import java.util.List;

public class Program1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        // printing sum of all numbers
        //1+2=3
        //3+3=6
        //6+45=51
        // ................

        int sum = numbers.stream().reduce((a,b)->a+b).get();

        System.out.println(sum);

    }

}