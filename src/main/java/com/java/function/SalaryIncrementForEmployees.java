package com.java.function;

import com.java.predicate.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrementForEmployees {
    public static void main(String[] args) {
        System.out.println("Before increment");
        System.out.println(populateEmployeeList());

        Predicate<Employee> p1 = employee -> employee.getSalary() < 10000;
        Predicate<Employee> p2 = employee -> employee.getSalary() >= 10000;

        Function<Employee,Employee> f1= employee ->{
            employee.setSalary(employee.getSalary()+5000.0);
            return employee;
        };

        Function<Employee,Employee> f2= employee ->{
            employee.setSalary(employee.getSalary()+3000.0);
            return employee;
        };

        System.out.println("After increment");
        for (Employee e:populateEmployeeList()) {
            if(p1.test(e)){
                f1.apply(e);
            } else if(p2.test(e)){
                f2.apply(e);
            }
            System.out.println(e);
        }
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
