package com.kadoshtecno.onlikeos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kadoshtecno.onlikeos.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
