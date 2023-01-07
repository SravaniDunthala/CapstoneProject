package com.registration.capstoneproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.capstoneproject.entity.State;

public interface StateRepository extends JpaRepository<State,Integer> {
}

