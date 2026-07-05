package com.stream.strings;

import java.util.Arrays;

public class Program4 {

    public static void main(String[] args) {

        String[] arr = {"java8", "Microservices", "SpringBoot"};

        // get longest string
        String s = Arrays.stream(arr)
                .reduce((a, b)-> a.length() > b.length() ? a : b)
                .get();

        System.out.println(s);
    }

}
