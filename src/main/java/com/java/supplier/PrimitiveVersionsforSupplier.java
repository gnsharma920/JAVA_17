package com.java.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitiveVersionsforSupplier {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> (int) (Math.random() * 10);
        LongSupplier longSupplier = () -> (long) (Math.random() * 10);
        DoubleSupplier doubleSupplier = () -> Math.random() * 10;
        BooleanSupplier booleanSupplier = () -> (int) (Math.random() * 10) % 2 == 0;
        System.out.println(intSupplier.getAsInt());
        System.out.println(longSupplier.getAsLong());
        System.out.println(doubleSupplier.getAsDouble());
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
