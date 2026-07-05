package com.java8.interfaces;

import java.util.function.Supplier;

public class ISupplier {

    public static void main(String[] args) {
        // supplier ==> supplier won't take any input and return the output

        Supplier<String> s = () -> {
            return new String("Hello world!");
        };

        String string = s.get();

        System.out.println(string);
    }
}
