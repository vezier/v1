package com.pacman.core.model;

import com.pacman.core.entity.Comanda;

public class MComanda {
	private int idlista ;
	private String idcuenta ;
	private String idconsumible ;	
	
	//Constructors
	public MComanda() {
	}
	
	public MComanda(Comanda comanda) {
		this.idlista = comanda.getIdlista();
		this.idcuenta = comanda.getCuenta().getIdcuenta();
		this.idconsumible = comanda.getConsumible().getIdconsumible();
	}
	
	public MComanda(int idlista,String idcuenta, String idconsumible) {
		this.idlista = idlista;
		this.idcuenta = idcuenta;
		this.idconsumible = idconsumible;
	}
	
	// Getter and Setter

	public int getIdlista() {
		return idlista;
	}

	public void setIdlista(int idlista) {
		this.idlista = idlista;
	}

	public String getIdcuenta() {
		return idcuenta;
	} 
	public void setIdcuenta(String idcuenta) {
		this.idcuenta = idcuenta;
	}
	public String getIdconsumible() {
		return idconsumible;
	}
	public void setIdconsumible(String idconsumible) {
		this.idconsumible = idconsumible;
	}	
}
