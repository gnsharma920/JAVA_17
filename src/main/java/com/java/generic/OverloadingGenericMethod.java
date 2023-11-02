package com.java.generic;

import java.util.ArrayList;
import java.util.List;

class LongTailAnimal{
    protected void chew(List<Object> input){}
//    protected void chew(List<Double> input){} Doesn't compile
}

class Anteater extends LongTailAnimal{
//    protected void chew(List<Double> input){} Doesn't compile
    protected void chew(List<Object> input){}
    protected void chew(ArrayList<Object> input){}
}
public class OverloadingGenericMethod {
    public static void main(String[] args) {

    }
}
