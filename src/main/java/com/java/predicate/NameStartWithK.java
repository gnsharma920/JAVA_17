package com.java.predicate;

import java.util.List;
import java.util.function.Predicate;

public class NameStartWithK {
    public static void main(String[] args) {
        List<String> list = List.of("Krutika", "Gopal,Rohan", "Kajal", "Krishan", "Kiran");
        Predicate<String> p1 = str -> str.startsWith("K");

        System.out.println("Name start with K: ");
        for (String s1 : list) {
            if (p1.test(s1)) {
                System.out.println(s1);
            }
        }
    }
}
