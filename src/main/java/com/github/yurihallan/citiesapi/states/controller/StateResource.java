package com.github.yurihallan.citiesapi.states.controller;

import com.github.yurihallan.citiesapi.states.entity.State;
import com.github.yurihallan.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {
    @Autowired
    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states(){
        return repository.findAll();
    }


}
