package com.java.sealed;

sealed class DemoA permits DemoB,DemoC {
    public void printA(){
        System.out.println("Class DemoA print method");
    }
}

non-sealed class DemoB extends DemoA{
    public void printB(){
        System.out.println("Class DemoB print method");
    }
}
final class DemoC extends DemoA{
    public void printC(){
        System.out.println("Class DemoC print method");
    }
}
class DemoD extends DemoB{
    public void printD(){
        System.out.println("Class DemoD print method");
    }
}

sealed interface DemoX permits DemoY{}

non-sealed interface DemoY extends DemoX {}
public class SealedDemo {
    public static void main(String args[]){
        DemoA demoA1 = new DemoA();
        DemoA demoA2 = new DemoB();
        DemoA demoA3 = new DemoC();
        DemoA demoA4 = new DemoD();

        System.out.println("***************************");
        System.out.println("Using Class DemoA reference");
        demoA1.printA();
        demoA2.printA();
        demoA3.printA();
        demoA4.printA();

        System.out.println("***************************");
        System.out.println("Using Class DemoB reference");
        DemoB demoB1 = new DemoB();
        DemoB demoB2 = new DemoD();

        demoB1.printB();
        demoB1.printA();
        demoB2.printB();
        demoB2.printA();

        System.out.println("***************************");
        System.out.println("Using Class DemoC reference");
        DemoC demoC1 = new DemoC();
//        DemoC demoC2 = new DemoD(); Error
        demoC1.printA();
        demoC1.printC();

        System.out.println("***************************");
        System.out.println("Using Class DemoD reference");
        DemoD domeD1=new DemoD();
        domeD1.printD();
        domeD1.printA();
        domeD1.printB();
    }
}
