package com.nagarro.nagp.aggregatorservice.model;

import java.util.List;

public class UserOrders {

	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public UserOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public UserOrders() {
	}
		
}
