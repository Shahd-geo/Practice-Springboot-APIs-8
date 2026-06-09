package com.example.Springboot.APIs8.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private  double rentalPricePerDay;

}
