package com.example.productoservices.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productoservices.interfaceservices.iProductosservices;
import com.example.productoservices.modeloentity.Produtos;

@RestController
@RequestMapping("/producto")
public class ProductosController {

	@Autowired
	public iProductosservices service;
	
	@GetMapping("/listar")
	public List<Produtos> listar(){return service.listar();}
	
	@GetMapping("/listar/{id}")
	public Produtos obtenerid(@PathVariable("id") int id){return service.listarid(id);}
	
	@PostMapping("/save")
	public Produtos guardar (@RequestBody Produtos p) {return service.guardar(p);}
	
	@PutMapping("/editar/{id}")
	public Produtos actualizar(@PathVariable("id") int id,@RequestBody Produtos p){
	Produtos prod=service.listarid(id);
	prod.setDescripcion(p.getDescripcion());
	prod.setNumprducto(p.getNumprducto());
	prod.setPrecio(p.getPrecio());
	prod.setStock(p.getStock());
		return service.guardar(prod);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") int id) {service.borrar(id);}
}
