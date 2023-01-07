package com.registration.capstoneproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.capstoneproject.entity.City;

public interface CityRepository extends JpaRepository<City,Integer> {
}

