package com.nagarro.nagp.aggregatorservice.model;

public class Order {

	private int orderId;
	private double orderAmount;
	private String orderDate;
	
	public Order() {
		
	}	
	
	public Order(int orderId, double orderAmount, String orderDate) {		
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
}
