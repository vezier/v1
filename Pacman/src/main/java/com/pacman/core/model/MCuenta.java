package com.pacman.core.model;

import com.pacman.core.entity.Cuenta;
import com.pacman.core.entity.Mesa;

public class MCuenta {
	private int numeromesa ;
	
	
	//Constructors
	
	public MCuenta() {

	}
	
	public MCuenta(Cuenta cuenta) {
		this.numeromesa = cuenta.getEstadocuenta();
	}

	public MCuenta(int estadocuenta) {
		this.numeromesa = estadocuenta;
	
	}
	

	public int getNumeromesa() {
		return numeromesa;
	}


	public void setNumeromesa(int estado_cuenta) {
		this.numeromesa = estado_cuenta;
	}
}
