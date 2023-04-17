package com.java.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        Predicate<Integer> p1 = i1 -> i1 > 10;
        Predicate<Integer> p2 = i1 -> i1 % 2 == 0;
        Predicate<Integer> p3 = i1 -> i1 % 4 == 0;

        System.out.println(p1.test(30));
        System.out.println(p2.test(30));
        System.out.println(p3.test(30));

        System.out.println(p1.and(p2).or(p3).test(30));
        System.out.println(p1.and(p2).and(p3).test(30));
        System.out.println(p1.and(p2).or(p3).negate().test(30));
    }
}
