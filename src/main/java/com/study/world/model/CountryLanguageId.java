package com.study.world.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CountryLanguageId implements Serializable {

    @Column(name = "CountryCode", nullable = false)
    private String countryCode;

    @Column(name = "Language", nullable = false)
    private String language;

}
