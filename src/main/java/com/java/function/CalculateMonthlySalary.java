package com.java.function;

import java.util.function.BiFunction;

class Employee {
    private Integer id;
    private String name;
    private Double dailyWage;

    public Employee(Integer id, String name, Double dailyWage) {
        this.id = id;
        this.name = name;
        this.dailyWage = dailyWage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(Double dailyWage) {
        this.dailyWage = dailyWage;
    }
}

class TimeSheet {
    private Integer id;
    private int days;

    public TimeSheet(Integer id, int days) {
        this.id = id;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

public class CalculateMonthlySalary {
    public static void main(String[] args) {
        BiFunction<Employee, TimeSheet, Double> bf = ((employee, timeSheet) -> employee.getDailyWage() * timeSheet.getDays());
        Employee e1 = new Employee(1, "Gopal", 2000.0);
        Employee e2 = new Employee(2, "Rohan", 4000.0);
        Employee e3 = new Employee(3, "Ronak", 3000.0);

        TimeSheet t1 = new TimeSheet(1, 22);
        TimeSheet t2 = new TimeSheet(2, 21);
        TimeSheet t3 = new TimeSheet(3, 19);

        System.out.println("Monthly Salary of GOPAL: " + bf.apply(e1, t1));
        System.out.println("Monthly Salary of ROHAN: " + bf.apply(e2, t2));
        System.out.println("Monthly Salary of RONAK: " + bf.apply(e3, t3));
    }
}
