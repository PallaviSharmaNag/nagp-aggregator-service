package com.nagarro.nagp.aggregatorservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.nagp.aggregatorservice.model.AggregatedOrderDetails;
import com.nagarro.nagp.aggregatorservice.model.User;
import com.nagarro.nagp.aggregatorservice.model.UserOrders;

@Service
public class AggregatorService {
	
	@Value("${user.key}")
	private String userUrl;
	@Value("${order.key}")
	private String orderUrl;	
	
	RestTemplate restTemplate= new RestTemplate();	
	
	public Object getOrderDetails(int id) {
		User user = restTemplate.getForObject(userUrl+"/user/1", User.class);
		UserOrders orders = restTemplate.getForObject(orderUrl+"/orders/1", UserOrders.class);
		AggregatedOrderDetails aggregatedOrderDetails = new AggregatedOrderDetails(user,orders);
		return aggregatedOrderDetails;
	}

}
