package com.java.consumer;

import java.util.function.*;

public class PrimitiveTypeFunctionalInterfaces {
    public static void main(String[] args) {
        System.out.println("**************** IntConsumer ****************");
        IntConsumer consumer = i1 -> System.out.println("The Square of value " + i1 + ": " + i1 * i1);
        consumer.accept(10);

        System.out.println("**************** LongConsumer ****************");
        LongConsumer longConsumer = i1 -> System.out.println("The Square of value " + i1 + ": " + i1 * i1);
        longConsumer.accept(10L);

        System.out.println("**************** DoubleConsumer ****************");
        DoubleConsumer doubleConsumer = i1 -> System.out.println("The Square of value " + i1 + ": " + i1 * i1);
        doubleConsumer.accept(100.0);

        System.out.println("**************** ObjIntConsumer ****************");
        ObjIntConsumer<String> objIntConsumer = (s1, i1) -> System.out.println("Length of String: " + s1.length() + " value: " + i1);
        objIntConsumer.accept("Hello, Gopal Sharma", 100);

        System.out.println("**************** ObjLongConsumer ****************");
        ObjLongConsumer<String> objLongConsumer = (s1, i1) -> System.out.println("Length of String: " + s1.length() + " value: " + i1);
        objLongConsumer.accept("Hello, Gopal Sharma", 100L);

        System.out.println("**************** ObjDoubleConsumer ****************");
        ObjDoubleConsumer<String> objDoubleConsumer = (s1, i1) -> System.out.println("Length of String: " + s1.length() + " value: " + i1);
        objDoubleConsumer.accept("Hello, Gopal Sharma", 100.7);


    }
}
