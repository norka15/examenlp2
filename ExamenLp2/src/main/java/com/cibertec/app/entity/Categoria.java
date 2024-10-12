package com.cibertec.app.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cate")
	private int idCate;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="frecuencia_compra")
	private int frecuenciaCompra;
	
}
