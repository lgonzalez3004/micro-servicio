package com.example.shoppingservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingservices.interfaces.iShopping;
import com.example.shoppingservices.interfaceservice.iShoppingservice;
import com.example.shoppingservices.modeloentity.Shopping;
@Service
public class Shoppingservice implements iShoppingservice{

	@Autowired
	private iShopping data;
	@Override
	public List<Shopping> listar() {
		// TODO Auto-generated method stub
		return data.findAll();
	}

	@Override
	public Shopping listarid(int id) {
		// TODO Auto-generated method stub
		return data.findById(id).get();
	}

	@Override
	public Shopping guardar(Shopping s) {
		// TODO Auto-generated method stub
		return data.save(s);
	}

	@Override
	public void borrar(int id) {
		data.deleteById(id);
	}

}
