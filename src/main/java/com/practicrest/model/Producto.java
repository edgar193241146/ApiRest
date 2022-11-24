package com.practicrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String modelo;
	private String marca;
	private float precio;
	
	public Producto(Integer id,String modelo,String marca,float precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}
	 
	public Producto(String modelo,String marca,float precio) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}
	
	public Producto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
