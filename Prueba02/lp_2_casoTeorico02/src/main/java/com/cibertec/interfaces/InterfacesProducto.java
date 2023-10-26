package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelos.Producto;

public interface InterfacesProducto extends JpaRepository<Producto, Long> {

}
