package com.practicrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practicrest.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
