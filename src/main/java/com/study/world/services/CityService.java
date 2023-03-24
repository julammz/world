package com.study.world.services;

import com.study.world.dto.CityDTO;
import com.study.world.dto.CountryDTO;
import com.study.world.model.City;
import com.study.world.model.Country;
import com.study.world.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public CityDTO City(Integer id){
        City city = cityRepository.findById(id).get();

        Country country = city.getCountry();

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


        CityDTO cityDTO = new CityDTO();
        cityDTO.setId(city.getId());
        cityDTO.setName(city.getName());
        cityDTO.setDistrict(city.getDistrict());
        cityDTO.setPopulation(city.getPopulation());
        cityDTO.setCountry(countryDTO);

        return cityDTO;
    }

}
