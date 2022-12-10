package com.example.clientesservices.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbCliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//	@NotEmpty()
	private String nombre;
	
	private String apellido;
	
	//@NotNull()
	//@Email
	private String Email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Cliente(int id, String nombre, String apellido, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Email = email;
	}

	public Cliente() {
		super();
	}
	
	
}
