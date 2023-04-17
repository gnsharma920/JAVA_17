package com.java.lambda;

interface Interf{
    public void methodOne();
}


class Test implements Interf
{
    @Override
    public void methodOne() {
        System.out.println("Method one execution");
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
        //without lambda
        Interf i=new Test();
        i.methodOne();

        //with lambda, No need to create separate class Test
        Interf i1=()-> System.out.println("Method one execution by lambda");
        i1.methodOne();
    }
}
