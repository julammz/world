package com.study.world.services;

import com.study.world.dto.CountryLanguageDTO;
import com.study.world.model.CountryLanguage;
import com.study.world.model.CountryLanguageId;
import com.study.world.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryLanguageService {

    @Autowired
    CountryLanguageRepository countryLanguageRepository;

    public CountryLanguageDTO getCountryLanguage(String countryCode, String language){

        Optional<CountryLanguage> countryLanguage = countryLanguageRepository.findById(new CountryLanguageId(countryCode, language));

        CountryLanguageDTO countryLanguageDTO = new CountryLanguageDTO();
        countryLanguageDTO.setCountryCode(countryLanguage.get().getCountryLanguageId().getCountryCode());
        countryLanguageDTO.setLanguage(countryLanguage.get().getCountryLanguageId().getLanguage());
        countryLanguageDTO.setIsOfficial(countryLanguage.get().getIsOfficial().equals("T"));
        countryLanguageDTO.setPercentage(countryLanguage.get().getPercentage());

        return countryLanguageDTO;
    }


}
