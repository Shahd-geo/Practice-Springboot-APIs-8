package com.example.Springboot.APIs8.controllers;

import com.example.Springboot.APIs8.entities.Campaign;
import com.example.Springboot.APIs8.services.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CampaignController {
    @Autowired
    CampaignService campaignService;

    @PostMapping("/campaign/add")
    public Campaign addCampaign(@RequestBody Campaign campaign){
        return campaignService.saveCampaign(campaign);
    }

    @GetMapping("/campaign/getAll")
    public List<Campaign> getAllCampaigns(){
        return campaignService.getAllCampaigns();
    }
}
