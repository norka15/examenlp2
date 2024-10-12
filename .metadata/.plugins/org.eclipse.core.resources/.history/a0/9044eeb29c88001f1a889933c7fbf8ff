package com.cibertec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.cibertec.app.entity.Producto;
import com.cibertec.app.service.CategoriaService;

import com.cibertec.app.service.ProductoService;

@Controller
public class ProductoController {
	@Autowired
	public ProductoService productoService;
	@Autowired
	public CategoriaService categoriaService;
	@GetMapping("/producto")
	public String Inventario(Model model) {
		model.addAttribute("productos",productoService.getAllProducto());
		model.addAttribute("categoriaList",categoriaService.getAllCategorias());
		return "Producto/index";
	}
	
	@GetMapping("/producto/new")
	public String createProducto(Model model) {
		Producto producto = new Producto();
		model.addAttribute("producto",producto);
		model.addAttribute("categoriaList",categoriaService.getAllCategorias());
		return "Producto/create";
	}
	@PostMapping("/producto")
	public String saveProducto(@ModelAttribute("producto") Producto producto) {
		productoService.guardarProducto(producto);
		return "redirect:/Prodcuto";
	}
	
	
	@GetMapping("/Producto/edit/{id}")
	public String editInventario(@PathVariable Integer id,Model model) {
		Producto inv = productoService.findProductoById(id);
		model.addAttribute("producto",inv);
		model.addAttribute("categoriaList",categoriaService.getAllCategorias());
		return "Producto/edit";
	}
	@PostMapping("/producto/{id}")
	public String updateCliente(@PathVariable Integer id,@ModelAttribute("inventario") Producto producto, Model model) {
	
		Producto existentInv = productoService.findProductoById(id);
		//cargarlo
		existentInv.setIdProd(id);
		existentInv.setNomProd(producto.getNomProd());
		existentInv.setIdCate(producto.getIdCate());
		existentInv.setStock(producto.getIdProd());
		//guardar el estudiante actualizado
		productoService.updateProductoById(existentInv);
		return "redirect:/Producto";
	}
}
