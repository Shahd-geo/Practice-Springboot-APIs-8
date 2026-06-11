package com.example.Springboot.APIs8.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
    @NotBlank(message = "Vehicle model cannot be empty")
    private String vehicleModel;
    @NotNull(message = "Rental price is required")
    @Positive(message = "Rental price must be greater than 0")
    private  double rentalPricePerDay;

}
