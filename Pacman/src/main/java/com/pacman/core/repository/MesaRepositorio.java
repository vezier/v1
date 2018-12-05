package com.pacman.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacman.core.entity.Mesa;
import java.io.Serializable;

@Repository("repositoriomesa")
public interface MesaRepositorio extends JpaRepository<Mesa,Serializable>{
	public abstract Mesa findByNumero(int numero);
}
