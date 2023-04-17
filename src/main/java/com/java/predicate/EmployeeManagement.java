package com.java.predicate;

import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagement {
    public static void main(String[] args) {

        System.out.println("QA information");
        Predicate<Employee> p1= employee -> employee.getDesignation().equals("QA");
        display(p1,populateEmployeeList());

        System.out.println("Ahmedabad Employees Information:");
        Predicate<Employee> p2= employee -> employee.getCity().equals("Ahmedabad");
        display(p2,populateEmployeeList());

        System.out.println("Employees whose salary <10000 To Give Increment:");
        Predicate<Employee> p3= employee -> employee.getSalary()<10000;
        display(p3,populateEmployeeList());

        System.out.println("Employees whose salary >10000 :");
        Predicate<Employee> p4= employee -> employee.getSalary()>10000;
        display(p4,populateEmployeeList());

        System.out.println("Ahmedabad Employees with salary >10000 :");
        display(p4.and(p2),populateEmployeeList());

        System.out.println("All Employee who are not QA ");
        display(p1.negate(),populateEmployeeList());

    }

    private static void display(Predicate<Employee> predicate, List<Employee> employeeList){
        for (Employee e:employeeList) {
            if(predicate.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("******************************************************");
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
