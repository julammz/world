package com.study.world.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Integer population;
    private String localName;
    private String governmentForm;
    private String code2;

}
