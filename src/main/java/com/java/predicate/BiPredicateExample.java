package com.java.predicate;

import java.util.function.BiPredicate;

//interface BiPredicate<T,U>{
//    public boolean test(T t, U u);
//}

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> (i1 + i2) % 2 == 0;
        System.out.println(biPredicate.test(10,10));
        System.out.println(biPredicate.test(11,12));
        System.out.println(biPredicate.test(11,11));
    }
}
