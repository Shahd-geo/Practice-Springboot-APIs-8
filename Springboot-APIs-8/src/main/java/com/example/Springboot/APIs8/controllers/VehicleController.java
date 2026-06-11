package com.example.Springboot.APIs8.controllers;

import com.example.Springboot.APIs8.entities.Vehicle;
import com.example.Springboot.APIs8.services.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping("/add")
    public Vehicle addVehicle(@Valid @RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles(){

        return vehicleService.getAllVehicles();
    }

    @GetMapping("/{id}")
    public Vehicle getVehicleById(@Valid@PathVariable Integer id){
        return vehicleService.getVehicleById(id);
    }

    @PutMapping("/update/{id}")
    public Vehicle updateVehicle(@Valid@PathVariable Integer id, @RequestBody Vehicle vehicle){

        return vehicleService.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehicle(@Valid@PathVariable Integer id){

        return vehicleService.deleteVehicle(id);
    }
}



