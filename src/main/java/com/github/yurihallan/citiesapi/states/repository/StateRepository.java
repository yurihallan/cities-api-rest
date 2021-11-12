package com.github.yurihallan.citiesapi.states.repository;

import com.github.yurihallan.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
