package com.registration.capstoneproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.capstoneproject.entity.City;
import com.registration.capstoneproject.repository.CityRepository;


@Service
public class CityService {
	
    @Autowired
    private CityRepository repository;

    public List<City> getCities() {
        return repository.findAll();
    }


}
