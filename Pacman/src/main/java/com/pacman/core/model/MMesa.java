package com.pacman.core.model;

import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;

public class MMesa {
	private int numero ;
	private int idcuenta ; // 0 or 1 if depends on
	
	//constructor
	
	public MMesa(Mesa mesa) {
		this.numero = mesa.getNumero();
		this.idcuenta = mesa.getCuenta().getIdcuenta();
	}
	
	public MMesa() {
		
	}
	public MMesa(int numero,int idcuenta) {
		this.numero = numero;
		this.idcuenta = idcuenta;
	}
	// getter and setter
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdcuenta() {
		return idcuenta ;
	}
	public void setIdcuenta(int idcuenta) {
		this.idcuenta = idcuenta;
	}
	
	
}
