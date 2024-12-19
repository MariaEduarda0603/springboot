package com.br_ifg.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br_ifg.cliente.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos personalizados podem ser adicionados aqui, se necessário
}
