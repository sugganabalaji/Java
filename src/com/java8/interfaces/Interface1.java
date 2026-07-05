package com.java8.interfaces;

@FunctionalInterface
public interface Interface1 {

    void abstractMethod();

    default void method1() {
        System.out.println("default method1");
    }

    default void method2() {
        System.out.println("default method2");
    }

    static void method3() {
        System.out.println("static method1");
    }

    static void method4() {
        System.out.println("static method2");
    }


}
