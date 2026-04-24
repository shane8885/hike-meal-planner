package com.hikemealplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MealDTO {
    private Long id;
    private String name;
    private String description;
    private String mealType;
    private Integer calories;
    private Double weightGrams;
    private Double proteinGrams;
    private Double carbsGrams;
    private Double fatGrams;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
