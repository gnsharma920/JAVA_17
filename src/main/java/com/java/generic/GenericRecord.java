package com.java.generic;

public record GenericRecord<T>(T name) {
    @Override
    public T name(){
        return name;
    }
}

