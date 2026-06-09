package com.example.Springboot.APIs8.repositories;

import com.example.Springboot.APIs8.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
