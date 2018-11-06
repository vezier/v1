package com.pacman.core.model;

import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;

public class MCuenta {
	private String id_cuenta ;
	private int estado_cuenta ;
	private Mesa mesa ;
	
	//Constructors
	
	public MCuenta() {

	}
	
	public MCuenta(Cuenta cuenta) {
		this.id_cuenta = cuenta.getId_cuenta();
		this.estado_cuenta = cuenta.getEstado_cuenta();
		this.mesa = cuenta.getMesa();
	}

	public MCuenta(String id_cuenta, int estado_cuenta, Mesa mesa) {
		super();
		this.id_cuenta = id_cuenta;
		this.estado_cuenta = estado_cuenta;
		this.mesa = mesa;
	}
	
	// Getter and Setter
	
	public String getId_cuenta() {
		return id_cuenta;
	}


	public void setId_cuenta(String id_cuenta) {
		this.id_cuenta = id_cuenta;
	}


	public int getEstado_cuenta() {
		return estado_cuenta;
	}


	public void setEstado_cuenta(int estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}


	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}	
}
