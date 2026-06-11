package com.example.Springboot.APIs8.controllers;

import com.example.Springboot.APIs8.entities.Employee;
import com.example.Springboot.APIs8.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }
    @PutMapping("/employee/update/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @Valid @RequestBody Employee employee){

        return employeeService.updateEmployee(id, employee);
    }
    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id){

        return employeeService.deleteEmployee(id);
    }
}

