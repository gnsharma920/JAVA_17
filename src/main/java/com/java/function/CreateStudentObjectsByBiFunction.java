package com.java.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class CreateStudentObjectsByBiFunction {
    public static void main(String[] args) {
        BiFunction<String,Integer,Student> bf=(name, marks) -> new Student(name,marks);

        ArrayList<Student> students=new ArrayList<>();
        students.add(bf.apply("Gopal",80));
        students.add(bf.apply("Rohan",90));
        students.add(bf.apply("Ronak",85));
        students.add(bf.apply("Nayan",80));
        students.add(bf.apply("Nikunj",90));
        students.add(bf.apply("Vivek",85));

        for (Student student: students) {
            System.out.println("*********************************************");
            System.out.println(student.name);
            System.out.println(student.marks);
        }

    }
}
