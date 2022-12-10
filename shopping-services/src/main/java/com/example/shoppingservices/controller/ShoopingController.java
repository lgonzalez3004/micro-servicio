package com.example.shoppingservices.controller;

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

import com.example.shoppingservices.interfaceservice.iShoppingservice;
import com.example.shoppingservices.modeloentity.Shopping;
//import com.example.shoppingservices.modeloentity.shoppingItems;

@RestController
@RequestMapping("/shopping")
public class ShoopingController {

	@Autowired
	private iShoppingservice service;
	
	@GetMapping("/listar")
	public List<Shopping> listar(){return service.listar();}
	
	@GetMapping("/listar/{id}")
	public Shopping listarid(@PathVariable("id")int id) {return service.listarid(id);}
	
	@PostMapping("/save")
	public Shopping guardar(@RequestBody Shopping s) {return service.guardar(s);}
	
	@PutMapping("/editar/{id}")
	public Shopping editar(@PathVariable("id")int id,@RequestBody Shopping s) {
		Shopping shoop=service.listarid(id);
		shoop.setDescripcion(s.getDescripcion());
		shoop.setId_cliente(s.getId_cliente());
		
		shoop.setStatud(s.getStatud());
		
		return service.guardar(shoop);}
	
	@DeleteMapping("/borrar")
	public void borrar(@PathVariable("id")int id) {service.borrar(id);}
}
