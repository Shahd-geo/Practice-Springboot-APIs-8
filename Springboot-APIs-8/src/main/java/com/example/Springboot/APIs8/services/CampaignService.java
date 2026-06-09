package com.example.Springboot.APIs8.services;

import com.example.Springboot.APIs8.entities.Campaign;
import com.example.Springboot.APIs8.repositories.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CampaignService {
        @Autowired
        CampaignRepository campaignRepository;

        public Campaign saveCampaign(Campaign campaign){
            return campaignRepository.save(campaign);
        }

        public List<Campaign> getAllCampaigns(){
            return campaignRepository.findAll();
        }
    }
