package com.pacman.core.repository;

import java.io.Serializable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pacman.core.entity.Consumible;

@Repository("repositorioconsumible")
public interface ConsumibleRepositorio extends JpaRepository<Consumible,Serializable>{
	public abstract Consumible findByNombre(String nombre); // retorna un consumible dandole un nombre
	//public abstract List<Consumible> findByNombre(String nombre);
	public abstract Consumible findByIdconsumible(String id) ;
}
