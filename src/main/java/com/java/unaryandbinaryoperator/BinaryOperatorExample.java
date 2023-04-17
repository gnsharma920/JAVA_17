package com.java.unaryandbinaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator=(i1,i2)->i1*i2;
        LongBinaryOperator longBinaryOperator=(i1, i2)->i1*i2;
        DoubleBinaryOperator doubleBinaryOperator=(i1, i2)->i1*i2;
        BinaryOperator<String> binaryOperator=(s1,s2)->s1.concat(s2);

        System.out.println(intBinaryOperator.applyAsInt(1,3));
        System.out.println(longBinaryOperator.applyAsLong(20L,10L));
        System.out.println(doubleBinaryOperator.applyAsDouble(23.0,100.0));
        System.out.println(binaryOperator.apply("Hello, ","Good morning "));
    }
}
