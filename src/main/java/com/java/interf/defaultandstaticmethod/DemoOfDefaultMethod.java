package com.java.interf.defaultandstaticmethod;

interface Interf {
    default void m1() {
        System.out.println("Default method of Interf");
    }
}

interface Left {
    default void m2() {
        System.out.println("Default method of LEFT");
    }
}

interface Right {
    default void m2() {
        System.out.println("Default method of RIGHT");
    }
}

public class DemoOfDefaultMethod implements Interf, Left, Right {

    public void m2() {
        System.out.println("method of DemoOfDefaultMethod");
    }

    public static void main(String[] args) {
        DemoOfDefaultMethod d1 = new DemoOfDefaultMethod();
        d1.m1();
        d1.m2();
    }
}
