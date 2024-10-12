package com.cibertec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Inventario;
import com.cibertec.app.repository.InventarioRepository;
import com.cibertec.app.services.InventarioService;

@Service
public class InventarioServiceImpl implements InventarioService {
	@Autowired
	InventarioRepository inventarioRepository;

	@Override
	public List<Inventario> getAllInventario() {
		// TODO Auto-generated method stub
		return inventarioRepository.findAll();
	}

	@Override
	public Inventario updateInventario(Inventario userEntity) {
		// TODO Auto-generated method stub
		return inventarioRepository.save(userEntity);
	}

	@Override
	public Inventario findInventarioById(Integer id) {
		// TODO Auto-generated method stub
		return inventarioRepository.findById(id).get();
	}
}
