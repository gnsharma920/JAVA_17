package com.java.lambda;

interface Interf3 {
    void m1();
}

public class LambdaDemo3 {
    int x = 888;

    public void m2() {
        int y = 99;
        Interf3 i3 = () -> {
            int x = 999;
            System.out.println(x);//999
            System.out.println(this.x);//888
            this.x=777;
            System.out.println(this.x);//777
//            y=88; CE
        };
        i3.m1();
    }

    public static void main(String[] args) {
        LambdaDemo3 l = new LambdaDemo3();
        l.m2();
    }
}
