package com.study.world.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CityDTO {

    private Integer id;
    private String name;
    private String district;
    private Integer population;
    private CountryDTO country;

}
