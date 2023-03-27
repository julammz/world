package com.study.world.controller;

import com.study.world.dto.CountryDTO;
import com.study.world.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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

    @MutationMapping
    public CountryDTO createCountry(@Argument String code, @Argument String name, @Argument String continent, @Argument String region,
                                    @Argument Double surfaceArea, @Argument Integer population, @Argument String localName,
                                    @Argument String governmentForm, @Argument String code2){

        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCode(code);
        countryDTO.setName(name);
        countryDTO.setContinent(continent);
        countryDTO.setRegion(region);
        countryDTO.setSurfaceArea(surfaceArea);
        countryDTO.setPopulation(population);
        countryDTO.setLocalName(localName);
        countryDTO.setGovernmentForm(governmentForm);
        countryDTO.setCode2(code2);

        return countryService.CreateCountry(countryDTO);
    }

}
