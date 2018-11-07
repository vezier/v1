package com.pacman.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacman.core.entity.Trabajador;
import java.io.Serializable;

@Repository("repositoriotrabajador")
public interface TrabajadorRepositorio extends JpaRepository<Trabajador,Serializable> {
	public abstract Trabajador findByRut(String rut) ;
}
