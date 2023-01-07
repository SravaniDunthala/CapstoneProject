package com.registration.capstoneproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.capstoneproject.entity.State;
import com.registration.capstoneproject.repository.StateRepository;

@Service
public class StateService {
    @Autowired
    private StateRepository repository;

    public List<State> getStates() {
        return repository.findAll();
    }


}
