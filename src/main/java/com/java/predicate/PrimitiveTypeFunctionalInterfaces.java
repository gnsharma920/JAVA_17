package com.java.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitiveTypeFunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println("********IntPredicate********");
        IntPredicate predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(3));

        System.out.println("********LongPredicate********");
        LongPredicate longPredicate = value -> value % 5 == 0;
        System.out.println(longPredicate.test(10));
        System.out.println(longPredicate.test(12));
        System.out.println(longPredicate.test(15));

        System.out.println("********DoublePredicate********");
        DoublePredicate doublePredicate = value -> value % 10 == 0;
        System.out.println(doublePredicate.test(10.0));
        System.out.println(doublePredicate.test(12.0));
        System.out.println(doublePredicate.test(15.0));
    }
}
