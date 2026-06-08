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
}
