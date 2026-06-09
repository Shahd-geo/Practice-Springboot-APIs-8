package com.example.Springboot.APIs8.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;
}
