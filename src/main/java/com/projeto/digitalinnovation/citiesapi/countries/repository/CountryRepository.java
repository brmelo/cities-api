package com.projeto.digitalinnovation.citiesapi.countries.repository;

import com.projeto.digitalinnovation.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
