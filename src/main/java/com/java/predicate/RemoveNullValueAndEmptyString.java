package com.java.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNullValueAndEmptyString {
    public static void main(String[] args) {
        String[] names = {"Gopal", "", null, "Rohan", "", "Nayan", null};
        Predicate<String> p1 = str -> str != null && !str.isEmpty();
        ArrayList<String> list=new ArrayList<>();
        for (String s1 : names) {
            if (p1.test(s1)) {
                list.add(s1);
            }
        }
        System.out.println("The List of valid Names: "+list);
    }
}
