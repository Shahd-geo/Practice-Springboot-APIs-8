package com.example.Springboot.APIs8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Entity
@Table(name = "employees")
public class Employee {
    @OneToMany
    private List<Campaign> campaigns;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String department;



//Print all employee records before adding a new employee-using to string
    @Override
    public String toString() {
        return id + " → " + name + " → " + department;
    }
}

