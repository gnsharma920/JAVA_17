package com.java.generic;

class TrickyCreate<T>{
    private T name;

    public <T> T create(T t){
        return t;
    }

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
}
public class GenericWithMethodAndClass {
    public static void main(String[] args) {
        TrickyCreate<String> trickyCreateTrickyCreate=new TrickyCreate<>();
        trickyCreateTrickyCreate.setName("Hello");
        System.out.println(trickyCreateTrickyCreate.create("Hi"));
        System.out.println(trickyCreateTrickyCreate.create(1));
        System.out.println(trickyCreateTrickyCreate.getName());
    }
}
