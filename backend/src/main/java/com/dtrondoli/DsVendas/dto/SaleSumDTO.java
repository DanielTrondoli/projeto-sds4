package com.dtrondoli.DsVendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dtrondoli.DsVendas.entities.Sale;
import com.dtrondoli.DsVendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	
	
	private static final long serialVersionUID = 4678563743948400217L;
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
