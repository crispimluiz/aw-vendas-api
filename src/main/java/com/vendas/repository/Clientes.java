package com.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
