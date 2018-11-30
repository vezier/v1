package com.pacman.core.model;

import com.pacman.core.entity.Mesa;

public class MMesa {
	private String idmesa ;
	private int numero ;
	private int estado ; // 0 or 1 if depends on
	
	//constructor
	
	public MMesa(Mesa mesa) {
		this.idmesa = mesa.getIdmesa();
		this.numero = mesa.getNumero();
		this.estado = mesa.getEstado();
	}
	
	public MMesa() {
		
	}
	public MMesa(String id_mesa, int numero, int estado) {
		this.idmesa = id_mesa;
		this.numero = numero;
		this.estado = estado;
	}
	// getter and setter
	public String getId_mesa() {
		return idmesa;
	}
	public void setId_mesa(String id_mesa) {
		this.idmesa = id_mesa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
