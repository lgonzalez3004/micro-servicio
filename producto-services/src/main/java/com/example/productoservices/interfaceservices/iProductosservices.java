package com.example.productoservices.interfaceservices;

import java.util.List;
//import java.util.Optional;

import com.example.productoservices.modeloentity.Produtos;

public interface iProductosservices {
	
	public List<Produtos> listar();
	public Produtos guardar(Produtos p);
	public Produtos listarid(int id);
	public void borrar(int id);
	
	
	

}
