package com.example.productoservices.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productoservices.modeloentity.Produtos;

@Repository
public interface iProducto extends JpaRepository<Produtos,Integer> {

}
