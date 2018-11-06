package com.pacman.core.model;

import com.pacman.core.entity.Comanda;
import com.pacman.core.entity.Consumible;
import com.pacman.core.entity.Cuenta;

public class MComanda {
	private String id_lista ;
	private Cuenta cuenta ;
	private Consumible consumible ;	
	
	//Constructors
	
	public MComanda() {

	}
	
	public MComanda(Comanda comanda) {
		this.id_lista = comanda.getId_lista();
		this.cuenta = comanda.getCuenta();
		this.consumible = comanda.getConsumible();
	}
	
	public MComanda(String id_lista, Cuenta cuenta, Consumible consumible) {
		this.id_lista = id_lista;
		this.cuenta = cuenta;
		this.consumible = consumible;
	}
	
	// Getter and Setter
	
	public String getId_lista() {
		return id_lista;
	}
	public void setId_lista(String id_lista) {
		this.id_lista = id_lista;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public Consumible getConsumible() {
		return consumible;
	}
	public void setConsumible(Consumible consumible) {
		this.consumible = consumible;
	}	
}