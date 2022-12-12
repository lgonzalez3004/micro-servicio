package com.example.shoppingservices.modeloentity;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.format.annotation.DateTimeFormat.ISO;
//import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbShopping")
public class Shopping {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String descripcion;

private int id_cliente;

//@Temporal(TemporalType.DATE)
//@DateTimeFormat(iso=ISO.DATE)
//private date fecha;

private char statud;


@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
private List<shoppingItems> items;


public Shopping() {
	items=new ArrayList<>();
}



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public int getId_cliente() {
	return id_cliente;
}


public void setId_cliente(int id_cliente) {
	this.id_cliente = id_cliente;
}


public char getStatud() {
	return statud;
}


public void setStatud(char statud) {
	this.statud = statud;
}


public List<shoppingItems> getItems() {
	return items;
}


public void setItems(List<shoppingItems> items) {
	this.items = items;
}


}
