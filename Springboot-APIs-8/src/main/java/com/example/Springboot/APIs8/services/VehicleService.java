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
    // GET BY ID
    public Vehicle getVehicleById(Integer id){
        return vehicleRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Vehicle updateVehicle(Integer id, Vehicle updatedVehicle){

        Vehicle existingVehicle = vehicleRepository.findById(id).orElse(null);

        if(existingVehicle == null){
            return null;
        }

        existingVehicle.setVehicleModel(updatedVehicle.getVehicleModel());
        existingVehicle.setRentalPricePerDay(updatedVehicle.getRentalPricePerDay());

        return vehicleRepository.save(existingVehicle);
    }

    // DELETE
    public String deleteVehicle(Integer id){

        Vehicle vehicle = vehicleRepository.findById(id).orElse(null);

        if(vehicle == null){
            return "Vehicle not found";
        }

        vehicleRepository.deleteById(id);

        return "Vehicle deleted successfully";
    }
}


