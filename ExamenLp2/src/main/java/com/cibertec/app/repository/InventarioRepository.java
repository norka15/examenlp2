package com.cibertec.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.app.entity.Inventario;
@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

}
