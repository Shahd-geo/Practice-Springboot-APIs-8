package com.example.Springboot.APIs8.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "campaigns")
public class Campaign {
    private Integer campaignId;
    private String campaignName;
    private String platform;
    private double budget;
}
