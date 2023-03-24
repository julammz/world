package com.study.world.controller;

import com.study.world.dto.CountryDTO;
import com.study.world.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CountryControllerGraphql {

    @Autowired
    CountryService countryService;

    @QueryMapping
    public CountryDTO getCountry(@Argument String code){
        return countryService.Country(code);
    }

    @QueryMapping
    public List<CountryDTO> countriesContinent(@Argument String continent){
        return countryService.countriesContinent(continent);
    }

}
