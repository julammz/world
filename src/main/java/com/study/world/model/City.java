package com.study.world.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name = "city")
public class City {

    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "District", nullable = false)
    private String district;

    @Column(name = "Population", nullable = false)
    private Integer population;

    /*@Column(name = "CountryCode", nullable = false)
    private String countryCode;*/
    @OneToOne
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;

}
