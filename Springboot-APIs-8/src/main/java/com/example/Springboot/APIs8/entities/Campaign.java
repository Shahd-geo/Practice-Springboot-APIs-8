package com.example.Springboot.APIs8.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
    @NotBlank(message = "Campaign name cannot be empty")
    private String campaignName;

    @NotBlank(message = "Platform cannot be empty")
    private String platform;

    @NotNull(message = "Budget is required")
    @Positive(message = "Budget must be greater than 0")
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
