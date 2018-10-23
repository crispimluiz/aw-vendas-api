package com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
