package com.study.world.controller;

import com.study.world.dto.CountryLanguageDTO;
import com.study.world.services.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CountryLanguageGraphql {

    @Autowired
    CountryLanguageService countryLanguageService;

    @QueryMapping
    public CountryLanguageDTO getCountryLanguage(@Argument String countryCode, @Argument String language){
        return countryLanguageService.getCountryLanguage(countryCode, language);
    }

}
