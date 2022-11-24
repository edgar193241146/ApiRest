package com.practicrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practicrest.model.Producto;
import com.practicrest.service.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoservice;
	
	@GetMapping("/listar")
	public List<Producto> obtenerProductos(){
		return productoservice.listarProducto();
	}
	
	@GetMapping("listar/{id}")
	public ResponseEntity<Producto> obetenerporid(@PathVariable Integer id){
		try {
			Producto producto = productoservice.obteneProducto(id);
			return new ResponseEntity<Producto>(producto,HttpStatus.OK);
	} catch(Exception exception) {
	 return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);	
	}
}
	
	@PostMapping("/listar")
	public void guardarProducto(@RequestBody Producto producto) {
		productoservice.guardarProducto(producto);
	}
	
	@PutMapping("/listar/{id}")
	public ResponseEntity<Producto>actualizarProducto(@RequestParam Producto producto,@PathVariable Integer id){
		 try { Producto productoActual = productoservice.obteneProducto(id);
		 productoActual.setMarca(producto.getMarca());
		 productoActual.setModelo(producto.getModelo());
		 productoActual.setPrecio(producto.getPrecio()) ;
		 
		 productoservice.guardarProducto(productoActual);
		 return new ResponseEntity<Producto>(HttpStatus.OK);}
		 catch(Exception exception){
			 return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		 }
		
	}
	
	@DeleteMapping("/listar/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		productoservice.eliminarProducto(id);
	}
	
}