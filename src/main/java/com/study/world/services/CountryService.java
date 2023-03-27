package com.study.world.services;

import com.study.world.dto.CountryDTO;
import com.study.world.model.Country;
import com.study.world.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public CountryDTO Country(String code){
        Country country = countryRepository.findById(code).get();
        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setCode(code);
        countryDTO.setName(country.getName());
        countryDTO.setContinent(country.getContinent());
        countryDTO.setRegion(country.getRegion());
        countryDTO.setSurfaceArea(country.getSurfaceArea());
        countryDTO.setPopulation(country.getPopulation());
        countryDTO.setLocalName(country.getLocalName());
        countryDTO.setGovernmentForm(country.getGovernmentForm());
        countryDTO.setCode2(country.getCode2());

        return countryDTO;
    }

    public List<CountryDTO> countriesContinent(String continent) {
        List<Country> countriesList = countryRepository.findByContinent(continent);

        List<CountryDTO> countryDTOList = countriesList.stream().map(country -> {
            CountryDTO countryDTO = new CountryDTO();
            countryDTO.setCode(country.getCode());
            countryDTO.setName(country.getName());
            countryDTO.setContinent(country.getContinent());
            countryDTO.setRegion(country.getRegion());
            countryDTO.setSurfaceArea(country.getSurfaceArea());
            countryDTO.setPopulation(country.getPopulation());
            countryDTO.setLocalName(country.getLocalName());
            countryDTO.setGovernmentForm(country.getGovernmentForm());
            countryDTO.setCode2(country.getCode2());
            return countryDTO;
        }).collect(Collectors.toList());

        return countryDTOList;
    }

    public CountryDTO CreateCountry(CountryDTO countryDTO){
        Country country = new Country(countryDTO.getCode(), countryDTO.getName(), countryDTO.getContinent(), countryDTO.getRegion(),
                countryDTO.getSurfaceArea(), null, countryDTO.getPopulation(), null, null, null, countryDTO.getLocalName(),
                countryDTO.getGovernmentForm(),null, null, countryDTO.getCode2());

        try{
            countryRepository.save(country);
        } catch (Exception e) {
            return null;
        }

        return this.Country(countryDTO.getCode());
    }

}
