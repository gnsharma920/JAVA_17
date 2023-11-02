package com.java.record;

import java.util.List;

public record Student(int id, String firstName, String lastName, List<String> subjects) {
    public static String STUDENT= "student";

    //public int percentage=90; Not possible to create instance veriable

    //valid but not recommended
    public Student(){
        this(0,null,null,null);
    }
    public Student {
        if(id == 0){
            throw new RuntimeException();
        }
    }
    public String getAddress(){
        return firstName.concat(": ").concat("Ahmedabad");
    }

}
