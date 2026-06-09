package com.example.Springboot.APIs8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vehicles")

public class Vehicle {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vehicleId;
    private String vehicleModel;
    private  double rentalPricePerDay;

}
