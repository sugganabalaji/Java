package com.java8.interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class IPredicate {

    public static void main(String[] args) {

        // predicate --> it takes only one input and returns true or false
        Predicate<String> p = (str) -> {
            return str.length() > 2;
        };

        Predicate<String> p2 = (str) -> {
            return str.equals("ABC");
        };

        // System.out.println(p2.test("abc"));

        // and ==== p.test() && p2.test()

        System.out.println(p.and(p2).test("ABC")); // p.test(ABC) ===> true && p2.test("ABC") === true == true

        // or ===> p.test() || p2.test()

        System.out.println(p.or(p2).test("abc")); // p.test(abc) ===> true || p2.test(abc) ==> false ====> true

        // negate =not ==> !p.test() // p.test() == true ==> !true ===> false

        System.out.println(p.negate().test("a")); // ===> p.test(a) //false ===> !false ===> result : true

        BiPredicate<String, String> bp = (str1, str2) -> {
            return str1.equals(str2);
        };

        System.out.println(bp.test("A", "A")); // A==A ? //true

        Predicate<String> not = Predicate.not(p);
        String s = "ABC";
        System.out.println(not.test(s));
        System.out.println(Predicate.isEqual("ABC").test(s));

    }

}
