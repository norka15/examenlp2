package com.cibertec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Categoria;

import com.cibertec.app.repository.CategoriaRepository;
import com.cibertec.app.services.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public List<Categoria> getAllCategorias() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
