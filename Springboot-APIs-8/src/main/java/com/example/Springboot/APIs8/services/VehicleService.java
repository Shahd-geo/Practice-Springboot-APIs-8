package com.example.Springboot.APIs8.services;

import com.example.Springboot.APIs8.entities.Vehicle;
import com.example.Springboot.APIs8.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
        @Autowired
        VehicleRepository vehicleRepository;

        public Vehicle saveVehicle(Vehicle vehicle){
            return vehicleRepository.save(vehicle);
        }

        public List<Vehicle> getAllVehicles(){
            return vehicleRepository.findAll();
        }
    }

