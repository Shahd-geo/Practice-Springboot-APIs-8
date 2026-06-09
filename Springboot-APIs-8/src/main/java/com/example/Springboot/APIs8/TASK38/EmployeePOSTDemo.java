package com.example.Springboot.APIs8.TASK38;

import com.example.Springboot.APIs8.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeePOSTDemo {
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        //  Store existing employees
        employees.add(new Employee(101, "Sara", "HR"));
        employees.add(new Employee(102, "Ahmed", "Finance"));
        employees.add(new Employee(103, "John", "Marketing"));
        // Display Existing Employees
        System.out.println("=== Existing Employees ===");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // New Employee (POST Request Simulation)
        Employee newEmployee = new Employee(101, "Ali", "IT");

        // Validation - Check Duplicate ID
        boolean exists = false;
        for (Employee employee : employees) {
            if (employee.getId().equals(newEmployee.getId())) {
                exists = true;
                break;
            }
        }
        //perform POST Operation
        if (exists) {
            System.out.println("\nEmployee ID already exists.");
            System.out.println("No employee was created.");
        } else {
            employees.add(newEmployee);

            System.out.println("\nEmployee Added Successfully");
            System.out.println("Employee ID: " + newEmployee.getId());
            System.out.println("Employee Name: " + newEmployee.getName());
            System.out.println("Status: Created");
        }
        //Display Updated Employee List
        System.out.println("\n=== Updated Employee List ===");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
