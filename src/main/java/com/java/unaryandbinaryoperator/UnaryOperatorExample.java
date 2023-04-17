package com.java.unaryandbinaryoperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = i1 -> i1 % 2;
        LongUnaryOperator longUnaryOperator = i1 -> i1 % 2;
        DoubleUnaryOperator doubleUnaryOperator = i1 -> i1 % 2;
        UnaryOperator<String> unaryOperator= s1-> s1.concat("Hell0");

        System.out.println(intUnaryOperator.applyAsInt(1));
        System.out.println(longUnaryOperator.applyAsLong(10L));
        System.out.println(doubleUnaryOperator.applyAsDouble(100.0));
        System.out.println(unaryOperator.apply("Good morning "));
    }
}
