package com.study.world.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.text.StyledEditorKit;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryLanguageDTO {

    private String countryCode;
    private String language;
    private Boolean isOfficial;
    private Double percentage;


}
