package com.example.Springboot.APIs8.controllers;

import com.example.Springboot.APIs8.entities.Campaign;
import com.example.Springboot.APIs8.services.CampaignService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampaignController {
    @Autowired
    CampaignService campaignService;

    @PostMapping("/campaign/add")
    public Campaign addCampaign(@Valid @RequestBody Campaign campaign){
        return campaignService.saveCampaign(campaign);
    }

    @GetMapping("/campaign/getAll")
    public List<Campaign> getAllCampaigns(){

        return campaignService.getAllCampaigns();
    }
    @GetMapping("/campaign/{id}")
    public Campaign getCampaignById(@PathVariable Integer id){
        return campaignService.getCampaignById(id);
    }
    @PutMapping("/campaign/update/{id}")
    public Campaign updateCampaign(@PathVariable Integer id, @Valid @RequestBody Campaign campaign){
        return campaignService.updateCampaign(id, campaign);
    }
    @DeleteMapping("/campaign/delete/{id}")
    public String deleteCampaign(@PathVariable Integer id){
        return campaignService.deleteCampaign(id);
    }
}
