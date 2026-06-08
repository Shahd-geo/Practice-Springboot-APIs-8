package com.example.Springboot.APIs8.TASK40;

import java.util.ArrayList;
import java.util.List;

public class CampaignManager {
    private List<Campaign> campaigns = new ArrayList<>();
    // Initialize with sample campaigns
    public CampaignManager() {
        campaigns.add(new Campaign("C101", "Summer Sale", "Instagram", 500));
        campaigns.add(new Campaign("C102", "Black Friday", "Google Ads", 1000));
        campaigns.add(new Campaign("C103", "Email Promo", "Email", 300));
    }
    // POST method to add a new campaign
    public String addCampaign(Campaign campaign) {
        if (isDuplicate(campaign.getCampaignId())) {
            return "Campaign ID already exists\nNo campaign was created";
        } else {
            campaigns.add(campaign);
            return "Campaign Created Successfully\n" +
                    "Campaign ID: " + campaign.getCampaignId() + "\n" +
                    "Campaign Name: " + campaign.getCampaignName() + "\n" +
                    "Platform: " + campaign.getPlatform() + "\n" +
                    "Budget: " + campaign.getBudget() + "\n" +
                    "Status: Active";
        }
    }
    // Check for duplicate campaign ID
    private boolean isDuplicate(String id) {
        for (Campaign c : campaigns) {
            if (c.getCampaignId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Display all campaigns
    public void displayCampaigns() {
        for (Campaign c : campaigns) {
            System.out.println(c);
        }
    }
}
