package com.example.shoppingservices.interfaceservice;

import java.util.List;

import com.example.shoppingservices.modeloentity.Shopping;

public interface iShoppingservice {

	public List<Shopping> listar();
	public Shopping listarid(int id);
	public Shopping guardar(Shopping s);
	public void borrar(int id);
}
