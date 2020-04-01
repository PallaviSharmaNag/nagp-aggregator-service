package com.nagarro.nagp.aggregatorservice.model;

import java.util.List;

public class AggregatedOrderDetails {

	private User userDetails;
	private UserOrders orders;
	
	public AggregatedOrderDetails() {	
	}
	
	public AggregatedOrderDetails(User userDetails, UserOrders orders) {
		this.userDetails = userDetails;
		this.orders = orders;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public UserOrders getOrders() {
		return orders;
	}

	public void setOrders(UserOrders orders) {
		this.orders = orders;
	}
	
	
	
}
