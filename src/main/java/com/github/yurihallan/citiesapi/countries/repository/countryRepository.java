package com.github.yurihallan.citiesapi.countries.repository;

import com.github.yurihallan.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryRepository extends JpaRepository<Country, Long> {
}
