package com.dtrondoli.DsVendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.dtrondoli.DsVendas.entities.Sale;

public class SaleDTO implements Serializable{
	
	
	private static final long serialVersionUID = 4678563743948400217L;
	
	private Long id;
	
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO saller;
	
	public SaleDTO() {
	}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO saller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.saller = saller;
	}
	
	public SaleDTO(Sale s) {
		this.id = s.getId();
		this.visited = s.getVisited();
		this.deals = s.getDeals();
		this.amount = s.getAmount();
		this.date = s.getDate();
		this.saller = new SellerDTO(s.getSaller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSaller() {
		return saller;
	}

	public void setSaller(SellerDTO saller) {
		this.saller = saller;
	}
	
	
}
