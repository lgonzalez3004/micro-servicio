package com.example.productoservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productoservices.interfaces.iProducto;
import com.example.productoservices.interfaceservices.iProductosservices;
import com.example.productoservices.modeloentity.Produtos;
@Service
public class Productoservice implements iProductosservices{

	@Autowired
	private iProducto data;
	@Override
	public List<Produtos> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	@Override
	public Produtos guardar(Produtos p) {
		// TODO Auto-generated method stub
		return data.save(p);
	}

	@Override
	public Produtos listarid(int id) {
		
		return data.findById(id).get();
	}

	@Override
	public void borrar(int id) {
		data.deleteById(id);
	}

}
