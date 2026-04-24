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
public class HikeMealDTO {
    private Long id;
    private Long hikeId;
    private Long mealId;
    private LocalDateTime scheduledDateTime;
    private Integer quantity;
    private MealDTO meal; // Include meal details
    private LocalDateTime createdAt;
}
