package com.java.predicate;

import java.util.function.Predicate;

public class SimpleExampleOfPredicate {
    public static void main(String[] args) {
        Predicate<String> predicate=s -> s.equals("TEST");
        System.out.println(predicate.test("TEST"));
        System.out.println(predicate.test("test"));
        System.out.println(predicate.test("Test"));
    }
}
