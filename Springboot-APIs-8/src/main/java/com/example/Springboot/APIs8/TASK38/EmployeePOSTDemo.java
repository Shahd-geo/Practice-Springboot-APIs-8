package com.example.Springboot.APIs8.TASK38;

import java.util.ArrayList;
import java.util.List;

public class EmployeePOSTDemo {
    private static List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        //  Store existing employees
        employees.add(new Employee("E102", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Marketing"));
        // Display Existing Employees
        System.out.println("=== Existing Employees ===");
        for (Employee employee : employees) {
            System.out.println(employee);

    }

