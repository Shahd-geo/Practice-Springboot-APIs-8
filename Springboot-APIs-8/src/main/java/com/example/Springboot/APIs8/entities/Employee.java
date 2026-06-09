package com.example.Springboot.APIs8.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Employee {
    private String id;
    private String name;
    private String department;


//Print all employee records before adding a new employee-using to string
    @Override
    public String toString() {
        return id + " → " + name + " → " + department;
    }
}

