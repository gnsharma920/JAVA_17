package com.java.function;

import java.util.function.*;

public class PrimitiveTypeFunctionalInterfaces {
    public static void main(String[] args) {

        System.out.println("**************** IntFunction ****************");
        IntFunction<String> intFunction = i1 -> "Hello IntFunction value: " + i1;
        System.out.println(intFunction.apply(10));
        System.out.println(intFunction.apply(20));

        System.out.println("**************** LongFunction ****************");
        LongFunction<String> longFunction = l1 -> "Hello LongFunction value: " + l1;
        System.out.println(longFunction.apply(10l));
        System.out.println(longFunction.apply(20l));

        System.out.println("**************** DoubleFunction ****************");
        DoubleFunction<String> doubleFunction = d1 -> "Hello DoubleFunction value: " + d1;
        System.out.println(doubleFunction.apply(10.0));
        System.out.println(doubleFunction.apply(20.0));

        System.out.println("**************** ToIntFunction ****************");
        ToIntFunction<String> toIntFunction = s1 -> s1.length();
        System.out.println(toIntFunction.applyAsInt("Hello ToIntFunction"));

        System.out.println("**************** ToLongFunction ****************");
        ToLongFunction<String> toLongFunction = s1 -> s1.length();
        System.out.println(toLongFunction.applyAsLong("Hello ToLongFunction"));

        System.out.println("**************** ToDoubleFunction ****************");
        ToDoubleFunction<String> toDoubleFunction = s1 -> s1.length();
        System.out.println(toDoubleFunction.applyAsDouble("Hello ToDoubleFunction"));

        System.out.println("**************** IntToDoubleFunction ****************");
        IntToDoubleFunction intToDoubleFunction = i1 -> i1 * i1;
        System.out.println(intToDoubleFunction.applyAsDouble(100));

        System.out.println("**************** IntToLongFunction ****************");
        IntToLongFunction intToLongFunction = i1 -> i1 * i1;
        System.out.println(intToLongFunction.applyAsLong(100));

        System.out.println("**************** LongToIntFunction ****************");
        LongToIntFunction longToIntFunction = i1 -> (int) (i1 * i1);
        System.out.println(longToIntFunction.applyAsInt(100L));

        System.out.println("**************** LongToDoubleFunction ****************");
        LongToDoubleFunction longToDoubleFunction = i1 -> i1 * i1;
        System.out.println(longToDoubleFunction.applyAsDouble(100L));

        System.out.println("**************** DoubleToIntFunction ****************");
        DoubleToIntFunction doubleToIntFunction = i1 -> (int) (i1 * i1);
        System.out.println(doubleToIntFunction.applyAsInt(100.7));

        System.out.println("**************** DoubleToLongFunction ****************");
        DoubleToLongFunction doubleToLongFunction = i1 -> (long) (i1 * i1);
        System.out.println(doubleToIntFunction.applyAsInt(100.7));

        System.out.println("**************** ToIntBiFunction ****************");
        ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> s1.concat(s2).length();
        System.out.println(toIntBiFunction.applyAsInt("Hello", "Gopal"));


        System.out.println("**************** ToDoubleBiFunction ****************");
        ToDoubleBiFunction<String, String> toDoubleBiFunction = (s1, s2) -> s1.concat(s2).length();
        System.out.println(toDoubleBiFunction.applyAsDouble("Hello", "Gopal"));

        System.out.println("**************** ToLongBiFunction ****************");
        ToLongBiFunction<String, String> toLongBiFunction = (s1, s2) -> s1.concat(s2).length();
        System.out.println(toLongBiFunction.applyAsLong("Hello", "Gopal"));
    }
}
