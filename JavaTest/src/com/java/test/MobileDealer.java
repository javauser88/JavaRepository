package com.java.test;

import java.util.List;

public class MobileDealer {

	private int dealerId;
	private String dealerName;
	private List<String> mobileBrands;
	
	public MobileDealer(int dealerId, String dealerName, List<String> mobileBrands) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.mobileBrands = mobileBrands;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public List<String> getMobileBrands() {
		return mobileBrands;
	}

	public void setMobileBrands(List<String> mobileBrands) {
		this.mobileBrands = mobileBrands;
	}
	
	
	
	
}
