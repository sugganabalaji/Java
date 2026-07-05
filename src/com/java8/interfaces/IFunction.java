package com.java8.interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class IFunction {

    public static void main(String[] args) {
        // FunctionInterface -- it takes input and returns output

        Function<String, Integer> f = (str) -> {
            return str.length();
        };
        // System.out.println(f.apply("ABC"));

        // BiFunction

        BiFunction<String, String, Boolean> bif = (str1, str2) -> {
            return str1.equalsIgnoreCase(str2);
        };

        // System.out.println(bif.apply("ABC", "ABC")); /// ABC==ABC ==> true

        // chaining

        // cal len of string and check if len > 2

        Function<Integer, Boolean> fcc = (i) -> {
            return i > 2;
        };

        System.out.println(f.andThen(fcc).apply("ABC")); // f.apply("ABC") ===> 3 ===> fcc.apply(3) ===> true

        // chaining
    }
}
