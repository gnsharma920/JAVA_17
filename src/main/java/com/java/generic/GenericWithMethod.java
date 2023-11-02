package com.java.generic;

class Handler{
    public static <T> T prepare(T t){
        return t;
    }
    public static <T> Create<T> ship(T t){
        Create<T> create = new Create<T>();
        create.createName(t);
        return create;
    }
}
public class GenericWithMethod {
    public static void main(String[] args) {
        System.out.println(Handler.prepare("Hello"));
        System.out.println(Handler.ship("Hello").fetchName()+ "      " + Handler.ship("Hello").fetchName().getClass().getName());
    }
}
