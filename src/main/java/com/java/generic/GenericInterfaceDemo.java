package com.java.generic;

interface GenericInterface<T>{
    public void test(T t);
}

class Robot implements GenericInterface<Robot>{
    @Override
    public void test(Robot robot) {

    }
}

class RobotCare<T> implements GenericInterface<T>{
    @Override
    public void test(T t) {

    }
}

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        GenericInterface robot1=new Robot();
        GenericInterface robot2=new Robot();
        robot1.test(robot2);

        GenericInterface<String> genericInterface=new RobotCare<>();
        genericInterface.test("Hello");

    }
}
