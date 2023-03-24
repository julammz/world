package com.study.world.repository;

import com.study.world.model.CountryLanguage;
import com.study.world.model.CountryLanguageId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
}
