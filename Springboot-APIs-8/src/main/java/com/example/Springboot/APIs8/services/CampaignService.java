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

        //ADD

        public Campaign saveCampaign(Campaign campaign){
            return campaignRepository.save(campaign);
        }
        //GET ALL - FIND ALL

        public List<Campaign> getAllCampaigns(){
            return campaignRepository.findAll();
        }
        //GET BY ID
        public Campaign getCampaignById(Integer id){
             return campaignRepository.findById(id).orElse(null);
         }
         //updateCampaign
        public Campaign updateCampaign(Integer id , Campaign updatedCampaign){

        Campaign existingCampaign =campaignRepository.findById(id).orElse(null);

        if(existingCampaign == null){
            return null;
        }

        existingCampaign.setCampaignName(
                updatedCampaign.getCampaignName());

        existingCampaign.setPlatform(
                updatedCampaign.getPlatform());

        existingCampaign.setBudget(
                updatedCampaign.getBudget());

        return campaignRepository.save(existingCampaign);
    }

    //deleteCampaign
    public String deleteCampaign(Integer id){

        Campaign campaign = campaignRepository.findById(id).orElse(null);

        if(campaign == null){
            return "Campaign not found";
        }

        campaignRepository.deleteById(id);

        return "Campaign deleted successfully";
    }

    }
