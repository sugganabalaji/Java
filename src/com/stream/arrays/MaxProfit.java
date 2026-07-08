package com.stream.arrays;

public class MaxProfit {

    public static void main(String[] args) {
        int[] prices = {7,4,2,3,1,5,6,4,7,5};

        System.out.println(maxProfit(prices));
    }

    /* You are given an array where each element represents the price of a stock on a given day.
       You need to find the maximum profit you can achieve by buying on one day and selling on another day after the buy.
       If no profit is possible, return 0. */

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Returns the greater of two int values.
            }
        }
        return maxProfit;
    }
}
