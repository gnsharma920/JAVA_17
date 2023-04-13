package com.java.multithreading.synchronization;

class Student {
    public static synchronized void getDetails(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }
    }
}

class StudentThread extends Thread {

    private final Student student;

    private final String name;

    StudentThread(Student student, String name) {
        this.student = student;
        this.name = name;
    }

    public void run() {
        Student.getDetails(name);
    }
}

public class ClassLevelLockDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        StudentThread t1 = new StudentThread(s1, "Gopal Sharma");
        StudentThread t2 = new StudentThread(s1, "Vaibhav Thakkar");
        StudentThread t3 = new StudentThread(s2, "Nikunj Patel");
        StudentThread t4 = new StudentThread(s3, "Ronak Patel");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
