package com.java.function;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        populate(studentArrayList);
        Function<Student, String> f = s -> {
            int marks = s.marks;
            if (marks >= 80) {
                return "A[Distinction]";
            } else if (marks >= 60) {
                return "B[First Class]";
            } else if (marks >= 50) {
                return "C[Second Class]";
            } else if (marks >= 35) {
                return "D[Third Class]";
            } else {
                return "E[Failed]";
            }
        };

        Consumer<Student> studentConsumer= s -> {
            System.out.println("*****************************************");
            System.out.println("Student Name:" + s.name);
            System.out.println("Student Marks:" + s.marks);
            System.out.println("Student Grade:" + f.apply(s));
        };

        Predicate<Student> p = s -> s.marks >= 60;
        for (Student s : studentArrayList) {
            if(p.test(s)) {
                studentConsumer.accept(s);
            }
        }
    }

    public static void populate(ArrayList<Student> studentArrayList) {
        studentArrayList.add(new Student("Rohan", 100));
        studentArrayList.add(new Student("Gopal", 65));
        studentArrayList.add(new Student("Nikunj", 55));
        studentArrayList.add(new Student("Ronak", 45));
        studentArrayList.add(new Student("Raj", 25));
    }
}
