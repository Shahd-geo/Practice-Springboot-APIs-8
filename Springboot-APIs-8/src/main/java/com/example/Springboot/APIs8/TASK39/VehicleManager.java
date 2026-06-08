package com.example.Springboot.APIs8.TASK39;

import com.example.Springboot.APIs8.TASK38.Employee;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private  List<Vehicle> vehicles = new ArrayList<>();
    public VehicleManager(){
        //  Store existing employees
        vehicles.add(new Vehicle("V101", "Toyota Corolla",  20 ));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18 ));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22 ));
    }
        // Add Create Method
    public String addVehicle(Vehicle vehicle) {
        for (Vehicle V : vehicles) {
            if (V.getVehicleId().equals(vehicle.getVehicleId())) {
                return "Vehicle ID already exists , No vehicle was added";
            }

        }
        vehicles.add(vehicle);
        System.out.println("Vehicle Added Successfully");
        return ("Vehicle ID: " + vehicle.getVehicleId())+"Vehicle Model: " + vehicle.getVehicleModel()+ "Rental Price Per Day: " + vehicle.getRentalPricePerDay() + " OMR" + "Status:Created";
    }



}
