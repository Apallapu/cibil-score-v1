package com.poc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CibilScoreDetails {
    @Schema(description = "name",
            example = "Johan", required = false)
    private String name;

    @Schema(description = "cibilScore",
            example = "850.0", required = false)
    private Double cibilScore;

    @Schema(description = "panCard",
            example = "BIH8789088", required = false)
    private String panCard;




}
