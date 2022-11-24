package com.practicrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicrest.model.Producto;
import com.practicrest.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productorepo;
	public List<Producto> listarProducto(){
		return productorepo.findAll();
		
	}
	
	public void guardarProducto(Producto producto) {
		productorepo.save(producto);
	}
	
	public Producto obteneProducto(Integer id) {
		return productorepo.findById(id).get();
	}
	
	public void eliminarProducto(Integer id) {
		productorepo.deleteById(id);
	}

}
