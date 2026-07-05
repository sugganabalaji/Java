package com.java8.interfaces;

@FunctionalInterface
public interface Interface2 extends Interface1 {

    // only one abstract method
    // n number of default and static methods
    // can not extend another functional interface. always make sure SAM by inheritance.

}
