package com.pacman.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacman.core.entity.Comanda;
import com.pacman.core.entity.Cuenta;

import java.io.Serializable;
import java.util.List; 

@Repository("repositoriocomanda")
public interface ComandaRepositorio extends JpaRepository<Comanda,Serializable>{
	
	public abstract Comanda findByIdlista(String idlista) ;
	
	public abstract List<Comanda> findByCuenta(Cuenta cuenta);
}
