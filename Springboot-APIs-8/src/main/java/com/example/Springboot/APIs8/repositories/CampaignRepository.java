package com.example.Springboot.APIs8.repositories;

import com.example.Springboot.APIs8.entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
}
