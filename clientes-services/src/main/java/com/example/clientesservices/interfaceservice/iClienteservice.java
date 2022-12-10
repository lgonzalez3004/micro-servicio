package com.example.clientesservices.interfaceservice;

import java.util.List;

import com.example.clientesservices.modelo.Cliente;

public interface iClienteservice {
	
public List<Cliente> listar();
public Cliente listarId (int id);
public Cliente guardar(Cliente c);
public void borrar(int id);

}
