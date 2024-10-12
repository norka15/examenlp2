package com.cibertec.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "inventario")
public class Inventario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="nro_inventario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer nroInventario;
	
	@Column(name="fecha")
	private Date fecha;
	
	@OneToOne
	@JoinColumn(name="id_prod")
	private Producto idProd;
	
	@Column(name="costo_ingreso")
	private BigDecimal costoIngreso;
	
	public Inventario(){
		
	}
}
