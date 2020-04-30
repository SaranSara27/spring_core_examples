package com.cts.core;

public class Customer {
	
	private int custID;
	private String custName;
	private double amount;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custID, String custName, double amount) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", amount=" + amount + "]";
	}
	
	

}
