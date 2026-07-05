package com.stream.numbers;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Program6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 45, 46, 555, 3, 44, 55, 49);

        //statistics

        DoubleSummaryStatistics summaryStatistics = numbers.stream()
                .mapToDouble(n->n)
                .summaryStatistics();

        System.out.println(summaryStatistics);

    }

}