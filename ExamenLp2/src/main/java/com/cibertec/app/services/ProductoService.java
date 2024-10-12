package com.cibertec.app.services;

import java.util.List;

import com.cibertec.app.entity.Producto;

public interface ProductoService {
	public List<Producto> getAllProducto();
	public Producto guardarProducto(Producto userEntity);
	public Producto findProductoById(Integer id);
	public Producto updateProductoById(Producto userEntity);
}
