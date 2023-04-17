package com.java.function;

import java.util.function.BiFunction;

//interface BiFunction<T,U,R>{
//    R apply(T t, U u);
//}
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (i1, i2) -> i1 * i2;
        System.out.println(biFunction.apply(10,20));
        System.out.println(biFunction.apply(13,4));
        System.out.println(biFunction.apply(2,6));
    }
}
