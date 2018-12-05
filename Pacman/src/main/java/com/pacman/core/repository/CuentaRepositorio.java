package com.pacman.core.repository;

import java.io.Serializable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pacman.core.entity.Cuenta;
import com.pacman.core.model.MCuenta;

@Repository("repositoriocuenta")
public interface CuentaRepositorio extends JpaRepository<Cuenta,Serializable>{
	
	//public abstract List<Cuenta> findByIdmesa( String idmesa);
	public abstract Cuenta findByIdcuenta(int idcuenta);
	
}
