package com.dtrondoli.DsVendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtrondoli.DsVendas.dto.SellerDTO;
import com.dtrondoli.DsVendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){		
		return sellerRepository
				.findAll()
				.stream()
				.map( x -> new SellerDTO(x))
				.collect(Collectors.toList());
	}
}
