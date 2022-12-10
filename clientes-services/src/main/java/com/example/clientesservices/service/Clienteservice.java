package com.example.clientesservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.clientesservices.interfaces.iCliente;
import com.example.clientesservices.interfaceservice.iClienteservice;
import com.example.clientesservices.modelo.Cliente;

@Service
public class Clienteservice implements iClienteservice{

	@Autowired
	private iCliente data;
	
	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	@Override
	public Cliente listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public Cliente guardar(Cliente c) {
		// TODO Auto-generated method stub
		return data.save(c);
	}

	@Override
	public void borrar(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

	
}
