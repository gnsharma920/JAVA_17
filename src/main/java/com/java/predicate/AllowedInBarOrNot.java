package com.java.predicate;

import java.util.List;
import java.util.function.Predicate;

class SoftwareEngineer {
    private String name;
    private Integer age;
    private boolean isHavingGF;

    public SoftwareEngineer(String name, Integer age, Boolean isHavingGF) {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean isHavingGF() {
        return isHavingGF;
    }

    public void setHavingGF(Boolean havingGF) {
        isHavingGF = havingGF;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class AllowedInBarOrNot {
    public static void main(String[] args) {
        List<SoftwareEngineer> list = List.of(new SoftwareEngineer("Gopal", 21, false),
              new SoftwareEngineer("Rohan", 23, true),
              new SoftwareEngineer("Nayn", 18, false)
        );

        Predicate<SoftwareEngineer> allowed = se -> se.getAge() >= 18 && se.isHavingGF();
        System.out.println("The Allowed Members into Pub are:");
        for (SoftwareEngineer se : list) {
            if (allowed.test(se)) {
                System.out.println(se.getName());
            }
        }

    }
}
