package com.dtrondoli.DsVendas.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtrondoli.DsVendas.dto.SaleDTO;
import com.dtrondoli.DsVendas.dto.SaleSuccessDTO;
import com.dtrondoli.DsVendas.dto.SaleSumDTO;
import com.dtrondoli.DsVendas.repositories.SaleRepository;
import com.dtrondoli.DsVendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		return saleRepository
				.findAll(pageable)
				.map( x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){		
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){		
		return saleRepository.successGroupedBySeller();
	}
}
