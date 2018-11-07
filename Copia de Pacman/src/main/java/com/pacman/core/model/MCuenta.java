package com.pacman.core.model;

import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;

public class MCuenta {
	private String id_cuenta ;
	private int estado_cuenta ;
	private String idmesa ;
	
	//Constructors
	
	public MCuenta() {

	}
	
	public MCuenta(Cuenta cuenta) {
		this.id_cuenta = cuenta.getId_cuenta();
		this.estado_cuenta = cuenta.getEstado_cuenta();
		this.idmesa = cuenta.getidMesa();
	}

	public MCuenta(String id_cuenta, int estado_cuenta, Mesa mesa) {
		super();
		this.id_cuenta = id_cuenta;
		this.estado_cuenta = estado_cuenta;
		this.idmesa = idmesa;
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


	public String getidmesa() {
		return idmesa;
	}


	public void setMesa(String idmesa) {
		this.idmesa = idmesa;
	}	
}
