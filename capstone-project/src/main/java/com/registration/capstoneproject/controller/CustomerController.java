package com.registration.capstoneproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.capstoneproject.entity.City;
import com.registration.capstoneproject.entity.Country;
import com.registration.capstoneproject.entity.Customer;
import com.registration.capstoneproject.entity.State;
import com.registration.capstoneproject.service.CityService;
import com.registration.capstoneproject.service.CountryService;
import com.registration.capstoneproject.service.CustomerService;
import com.registration.capstoneproject.service.StateService;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    
    @Autowired
    private CountryService countryService;
    
    @Autowired
    private StateService stateService;
    
    @Autowired
    private CityService cityService;
    
    
    @GetMapping(path = "/checkCredit")
   	public CreditCheck creditcheck() {
   		int min = 400;
   		int max = 1000;
   		int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
   		return new CreditCheck(random_int);
   	}

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> findAllCustomer() {
        return customerService.getCustomers();
    }
    
    @GetMapping("/countries")
    public List<Country> findAllCountries() {
        return countryService.getCountries();
        
    }
    
    @GetMapping("/states")
    public List<State> findAllStates() {
        return stateService.getStates();
    }
	
    @GetMapping("/cities") 
    public List<City> findAllCities() { 
	    return cityService.getCities(); 
	}
	 
}
