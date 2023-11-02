package com.java.generic;

import java.util.ArrayList;
import java.util.List;

class Alpha{

}
public class OverridingWithGeneric {

    public List<String> hairy(List<String> list){
        return List.of("parent");
    }
    public List<String> hairy(ArrayList<String> list){
        return List.of("parent");
    }

}
