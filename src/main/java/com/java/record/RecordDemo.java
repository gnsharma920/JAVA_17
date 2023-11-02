package com.java.record;

import java.util.List;

public class RecordDemo {
    public static void main(String[] args){
        Student s1=new Student(1,"Gopal","Sharma", List.of("Maths", "English"));
        Student s2=new Student(1,"Gopal","Sharma", List.of("Maths", "English"));
//        Student s3=new Student(0,"Gopal","Sharma", List.of("Maths", "English"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(s1.id());
        System.out.println(s1.firstName());
        System.out.println(s1.lastName());
        System.out.println(s1.subjects());

        System.out.println(s1.getAddress());
    }
}
