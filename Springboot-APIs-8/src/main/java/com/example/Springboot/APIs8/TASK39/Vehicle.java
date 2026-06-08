package com.example.Springboot.APIs8.TASK39;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Vehicle {
    private String vehicleId;
    private int vehicleModel;
    private  int rentalPricePerDay;

}
