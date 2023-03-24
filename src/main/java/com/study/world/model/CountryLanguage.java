package com.study.world.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode", nullable = false)
    private String countryCode;

    @Column(name = "Language", nullable = false)
    private String language;

    @Column(name = "IsOfficial", nullable = false)
    private String isOfficial;

    @Column(name = "Percentage", nullable = false)
    private Double percentage;

}
