package com.pacman.core.model;

import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;

public class MCuenta {
	private String idcuenta ;
	private int estado_cuenta ;
	private String idmesa ;
	
	//Constructors
	
	public MCuenta() {

	}
	
	public MCuenta(Cuenta cuenta) {
		this.idcuenta = cuenta.getIdcuenta();
		this.estado_cuenta = cuenta.getEstado_cuenta();
		this.idmesa = cuenta.getMesa().getIdmesa();
	}

	public MCuenta(String id_cuenta, int estado_cuenta, Mesa mesa) {
		this.idcuenta = id_cuenta;
		this.estado_cuenta = estado_cuenta;
		this.idmesa = mesa.getIdmesa();
	}
	
	// Getter and Setter
	
	public String getId_cuenta() {
		return idcuenta;
	}


	public void setId_cuenta(String id_cuenta) {
		this.idcuenta = id_cuenta;
	}


	public int getEstado_cuenta() {
		return estado_cuenta;
	}


	public void setEstado_cuenta(int estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}


	public String getMesa() {
		return idmesa;
	}


	public void setMesa(String mesa) {
		this.idmesa = mesa;
	}	
}
