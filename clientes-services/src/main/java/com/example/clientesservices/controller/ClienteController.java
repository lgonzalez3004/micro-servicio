package com.example.clientesservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clientesservices.interfaceservice.iClienteservice;
import com.example.clientesservices.modelo.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private iClienteservice service;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){ return service.listar();}
	
	@GetMapping("/listar/{id}")
	public Cliente obtener (@PathVariable("id")int id) {return service.listarId(id);}
	
	@PostMapping("/guardar")
	public Cliente guardar(@RequestBody Cliente c) {return service.guardar(c);}
	
	@PutMapping("/editar/{id}")
	public Cliente editar(@PathVariable("id") int id,@RequestBody Cliente c) {
		Cliente cliente=service.listarId(id);
		cliente.setNombre(c.getNombre());
		cliente.setApellido(c.getApellido());
		cliente.setEmail(c.getEmail());
		return service.guardar(cliente);
	}
	
	@DeleteMapping("/eliminar")
	public void borrar(@PathVariable("id") int id) {service.borrar(id);}
	
}
