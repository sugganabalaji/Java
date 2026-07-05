package com.stream.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program10 {

    public static void main(String[] args) {

        // find the n-th highest number
        int[] input = {5, 9, 2, 13, 42, 56, 24, 36};
        int n = 2;
        Integer secondHighest = findNthHighest(input, n);
        System.out.println(secondHighest); // 42

    }

    /**
     * What is .boxed() in Java Streams?
     * The boxed() method in Java Streams converts a primitive stream
     * (like IntStream, LongStream, or DoubleStream) into a stream of their corresponding wrapper class objects
     * (e.g., Stream<Integer>, Stream<Long>, Stream<Double>).
     * Arrays.stream(intArr):
     * This creates an IntStream from the int array intArr.
     * An IntStream is a specialized stream for primitive int values.
     * The boxed() method in this code converts the IntStream (a stream of primitive int values)
     * into a Stream<Integer> (a stream of Integer objects).
     */
    private static Integer findNthHighest(int[] intArr, int n) {
        if (n == 0) {
            return null;
        }
        System.out.println(Arrays.stream(intArr) // IntStream
                .boxed()  // Stream<Integer>
                .sorted(Comparator.reverseOrder())
                .toList());

        return Arrays.stream(intArr)
                .boxed()
                .sorted(Comparator.reverseOrder()) // sorts in reverse order
                .skip(n - 1) // skips till (n-1) index elements.
                .findFirst() // retrieves the n-th Highest value
                .orElse(null);
    }


}