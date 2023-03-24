package com.study.world.repository;

import com.study.world.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CountryRepository extends JpaRepository<Country,String> {
    List<Country> findByContinent(String continent);

}
