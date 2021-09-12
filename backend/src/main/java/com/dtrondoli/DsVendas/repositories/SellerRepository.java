package com.dtrondoli.DsVendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtrondoli.DsVendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
