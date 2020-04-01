package com.nagarro.nagp.aggregatorservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.aggregatorservice.service.AggregatorService;


@RestController
@RequestMapping("/orderdetails")
public class AggregatorController {

	@Autowired
	AggregatorService aggregatorService;
	
	@GetMapping(value = "/{id}")
	public Object getOrderDetails(@PathVariable int id) {
		return aggregatorService.getOrderDetails(id);
	}
	
}
