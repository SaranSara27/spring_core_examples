package com.cts.core;

public class Person {
	
	private String pName;
	private Address ad;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", ad=" + ad + "]";
	}
	
	

}
