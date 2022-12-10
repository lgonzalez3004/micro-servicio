package com.example.clientesservices.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clientesservices.modelo.Cliente;

@Repository
public interface iCliente extends JpaRepository<Cliente,Integer> {

	
}
