package com.example.Springboot.APIs8.TASK40;

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
