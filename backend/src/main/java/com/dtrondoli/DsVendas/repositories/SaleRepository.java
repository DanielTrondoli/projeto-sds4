package com.dtrondoli.DsVendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dtrondoli.DsVendas.dto.SaleSuccessDTO;
import com.dtrondoli.DsVendas.dto.SaleSumDTO;
import com.dtrondoli.DsVendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.dtrondoli.DsVendas.dto.SaleSumDTO(obj.saller, SUM(obj.amount)) "
			+ "FROM Sale as obj "
			+ "GROUP BY obj.saller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.dtrondoli.DsVendas.dto.SaleSuccessDTO(obj.saller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale as obj "
			+ "GROUP BY obj.saller")
	List<SaleSuccessDTO> successGroupedBySeller();
	
}
