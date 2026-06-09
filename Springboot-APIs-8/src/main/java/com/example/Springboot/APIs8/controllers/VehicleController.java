package com.example.Springboot.APIs8.controllers;

import com.example.Springboot.APIs8.entities.Vehicle;
import com.example.Springboot.APIs8.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping("/vehicle/add")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("/vehicle/getAll")
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }
}

