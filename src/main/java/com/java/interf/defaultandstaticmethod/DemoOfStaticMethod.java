package com.java.interf.defaultandstaticmethod;

interface Inter{
    static void m1(){
        System.out.println("Interface static method");
    }
}
public class DemoOfStaticMethod implements Inter{

    public static void main(String[] args) {
        DemoOfStaticMethod demo=new DemoOfStaticMethod();
//        demo.m1();// CE
//        DemoOfStaticMethod.m1(); //CE
        Inter.m1();
    }
}
