package com.java.function;

import com.java.predicate.Employee;

import java.util.List;

public class TotalMonthlySalaryOfAllEmployees {
    static double totalSalary;

    public static void main(String[] args) {
        populateEmployeeList().stream().forEach(employee -> totalSalary += employee.getSalary());

        System.out.println("Total Employees Salary: " + totalSalary);
    }

    private static List<Employee> populateEmployeeList() {
        return List.of(new Employee("Gopal", "SS", 10000, "Ahmedabad"),
              new Employee("Rohan", "SSS", 20000, "Mumbai"),
              new Employee("Nayan", "JSS", 5000, "Anand"),
              new Employee("Chirag", "SD", 50000, "Ahmedabad"),
              new Employee("Manan", "SD", 40000, "Mumbai"),
              new Employee("Jaimin", "SS", 10000, "Jaipur"),
              new Employee("Ronak", "QA", 7000, "Delhi")
        );
    }
}
