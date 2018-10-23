package com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {
	
}
