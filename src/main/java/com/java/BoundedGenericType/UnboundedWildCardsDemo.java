package com.java.BoundedGenericType;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildCardsDemo {

    public static void printList(List<?> objects) {
        for (Object x: objects){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        printList(list);
    }
}
