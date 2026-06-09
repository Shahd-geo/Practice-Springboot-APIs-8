package com.example.Springboot.APIs8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer campaignId;
    private String campaignName;
    private String platform;
    private double budget;
    @ManyToOne
    private Employee employee;
    public Campaign(Integer campaignId,
                    String campaignName,
                    String platform,
                    double budget) {

        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.platform = platform;
        this.budget = budget;
    }
}
