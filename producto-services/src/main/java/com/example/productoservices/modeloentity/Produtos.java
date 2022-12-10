package com.example.productoservices.modeloentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbProducto")
public class Produtos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String numprducto;
	private String descripcion;
	private Double stock;
	private Double precio;
	public Produtos(int id, String numprducto, String descripcion, Double stock, Double precio) {
		super();
		this.id = id;
		this.numprducto = numprducto;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}
	public Produtos() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumprducto() {
		return numprducto;
	}
	public void setNumprducto(String numprducto) {
		this.numprducto = numprducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getStock() {
		return stock;
	}
	public void setStock(Double stock) {
		this.stock = stock;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
	
}
