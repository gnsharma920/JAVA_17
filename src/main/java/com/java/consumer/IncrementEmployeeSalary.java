package com.java.consumer;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

public class IncrementEmployeeSalary {
    public static void main(String[] args) {
        List<String> temp= List.of(null);
        System.out.println(temp);
//        List<Employee> employees = populate();
//
//        BiConsumer<Employee, Double> biConsumer = (employee, increment) -> {
//            Double currentSalary = employee.getSalary();
//            employee.setSalary(currentSalary + increment);
//        };
//
//        for (Employee e : employees) {
//            biConsumer.accept(e, 5000.0);
//        }
//
//        for (Employee e : employees) {
//            System.out.println("*********************************************");
//            System.out.println("Name: " + e.getName());
//            System.out.println("Salary: " + e.getSalary());
//        }
    }

    public static ArrayList<Employee> populate() {
        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Gopal", 1000.0));
        l.add(new Employee("Ronak", 2000.0));
        l.add(new Employee("Rohan", 3000.0));
        l.add(new Employee("Vaibhav", 4000.0));
        return l;
    }
}
