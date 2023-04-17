package com.java.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String s1 = "Heyy! Gopal Sharma, How are you? ";

        System.out.println("********************************************");
        System.out.println("Remove Space from the string");
        Function<String, String> f1 = str -> str.replaceAll(" ", "");
        System.out.println(f1.apply(s1));

        System.out.println("********************************************");
        System.out.println("Number of space in the string");
        Function<String, Integer> f2 = str -> str.length() - str.replaceAll(" ", "").length();
        System.out.println(f2.apply(s1));
    }
}
