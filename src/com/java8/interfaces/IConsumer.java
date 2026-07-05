package com.java8.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class IConsumer {

    public static void main(String[] args) {

        // Consumer ---> it takes only input --- only one input
        Consumer<String> c = (str) -> {
            System.out.println(str.toUpperCase());
        };
        c.accept("balaji");

        // BiConsumer -- two inputs
        BiConsumer<String, String> bi = (str1, str2) -> {
            System.out.println(str1.concat(str2));
        };
        bi.accept("Balaji", " Naidu");

        // chaining

        // requirement == > step-1 .concat step-2 : convert into uppercase -->using
        // two or more consumers

        // requirement == > step-1 uppercase step-2 calculate length
        // two or more consumers

        Consumer<String> c2 = (str) -> {
            System.out.println(str.length());
        };

        c.andThen(c2).accept("balaji"); // c.accept("balaji") ===> BALAJI // c2.accept("balaji") ===> 6
    }
}

