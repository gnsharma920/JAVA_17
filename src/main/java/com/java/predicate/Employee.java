package com.java.predicate;

public class Employee {
    private String name;
    private String designation;
    private double salary;
    private String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", name, designation, salary, city);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Employee employee = (Employee) obj;
        if (name.equals(employee.getName())
              && designation.equals(employee.getDesignation())
              && salary == employee.getSalary()
              && city.equals(employee.getCity())
        ) {
            return true;
        }
        return false;
    }
}
