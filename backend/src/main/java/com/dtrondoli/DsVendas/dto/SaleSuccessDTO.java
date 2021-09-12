package com.dtrondoli.DsVendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dtrondoli.DsVendas.entities.Sale;
import com.dtrondoli.DsVendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	
	
	private static final long serialVersionUID = 4678563743948400217L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
