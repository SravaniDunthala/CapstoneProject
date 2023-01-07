package com.registration.capstoneproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.capstoneproject.entity.Country;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}

