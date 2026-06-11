package com.example.Springboot.APIs8.services;

import com.example.Springboot.APIs8.entities.Employee;
import com.example.Springboot.APIs8.repositories.EmployeeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    //ADD
    public Employee saveEmployee( Employee employee) {

        return employeeRepository.save(employee);
    }
    //GET ALL - FIND ALL

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    // GET BY ID
    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Employee updateEmployee(Integer id , Employee updatedEmployee){

        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        if(existingEmployee == null){
            return null;
        }

        existingEmployee.setName(updatedEmployee.getName());
        existingEmployee.setDepartment(updatedEmployee.getDepartment());

        return employeeRepository.save(existingEmployee);
    }

    // DELETE
    public String deleteEmployee(Integer id){

        Employee employee = employeeRepository.findById(id).orElse(null);

        if(employee == null){
            return "Employee not found";
        }

        employeeRepository.deleteById(id);

        return "Employee deleted successfully";
    }
}

