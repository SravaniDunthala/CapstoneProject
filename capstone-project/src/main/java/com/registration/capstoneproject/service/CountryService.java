package com.registration.capstoneproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.capstoneproject.entity.Country;
import com.registration.capstoneproject.repository.CountryRepository;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;

    public List<Country> getCountries() {
        return repository.findAll();
    }


}
