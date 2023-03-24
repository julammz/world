package com.study.world.controller;

import com.study.world.dto.CityDTO;
import com.study.world.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CityControllerGraphql {

    @Autowired
    CityService cityService;

    @QueryMapping
    public CityDTO getCity(@Argument Integer id){
        return cityService.City(id);
    }

}
