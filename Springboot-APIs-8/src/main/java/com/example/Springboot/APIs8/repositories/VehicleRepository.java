package com.example.Springboot.APIs8.repositories;

import com.example.Springboot.APIs8.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
